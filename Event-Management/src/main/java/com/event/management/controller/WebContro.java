package com.event.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebContro {
    @GetMapping("/")
    public String EventPage() {
        return "EventPage"; // refers to src/main/resources/templates/index.html if using Thymeleaf
    }
}


