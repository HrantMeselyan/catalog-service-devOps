package com.example.catalogservicedevops.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    public String home() {
        return "Welcome to Catalog Service";
    }
}
