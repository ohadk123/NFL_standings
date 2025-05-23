package com.example.demo.standings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class StandingController {
    private final StandingRepository repo;

    public StandingController(StandingRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public String showStandings(Model model) {

        List<StandingRecord> standings = repo.getAllFromView();

        Map<String, List<StandingRecord>> grouped = standings.stream()
                        .collect(Collectors.groupingBy(StandingRecord::division));

        model.addAttribute("groupedStandings", grouped);
        return "standings";
    }
}
