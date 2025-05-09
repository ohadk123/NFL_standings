package com.example.demo.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("/register")

    @PostMapping("/login")

    @GetMapping("/me")

    @GetMapping("/users/:id/balance")

    @GetMapping("/users/:id/bets")
}
