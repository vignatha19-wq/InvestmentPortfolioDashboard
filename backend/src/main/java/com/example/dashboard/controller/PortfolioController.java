package com.example.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioController {

    @GetMapping("/portfolio")
    public String getPortfolio() {
        return "Investment portfolio data service is active.";
    }
}
