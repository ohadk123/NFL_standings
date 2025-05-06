package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class StandingController {
    private final StandingRepository repo;

    public StandingController(StandingRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String showStandings(Model model) {
        List<StandingClass> standings = repo.getAllFromView();

        Map<String, List<StandingClass>> grouped = standings.stream()
                        .collect(Collectors.groupingBy(StandingClass::getDivision));

        model.addAttribute("groupedStandings", grouped);
        return "standings";
    }
}
