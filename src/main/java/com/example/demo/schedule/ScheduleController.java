package com.example.demo.schedule;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleRepository repo;


    public ScheduleController(ScheduleRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public String showSchedule(Model model) {
        List<ScheduleRecord> scheduleRecordList = repo.getAllFromView();

        Map<Integer, Map<String, List<ScheduleRecord>>> grouped = scheduleRecordList.stream()
                .collect(Collectors.groupingBy(
                        ScheduleRecord::week,
                        Collectors.groupingBy(
                                ScheduleRecord::day,
                                LinkedHashMap::new,
                                Collectors.toList()
                            )
                )
        );
        model.addAttribute("groupedSchedule", grouped);



        return "schedule";
    }
}
