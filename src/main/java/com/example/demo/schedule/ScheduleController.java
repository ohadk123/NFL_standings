package com.example.demo.schedule;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleRepository repo;


    public ScheduleController(ScheduleRepository repo) {
        this.repo = repo;
    }

    private static final List<String> dayOrder = List.of("Thursday", "Sunday", "Monday");

    @GetMapping
    public String showSchedule(Model model) {
        List<Schedule> scheduleList = repo.getAllFromView();
        // Map<String, Map<String, List<Person>>> peopleByStateAndCity
        // = personStream.collect(Collectors.groupingBy(Person::getState,
        //                                              Collectors.groupingBy(Person::getCity)));
        Map<Integer, Map<String, List<Schedule>>> grouped = scheduleList.stream()
                .collect(Collectors.groupingBy(
                        Schedule::getWeek,
                        Collectors.groupingBy(Schedule::getDay)
                )
        );
        model.addAttribute("groupedSchedule", grouped);
        return "schedule";
    }
}
