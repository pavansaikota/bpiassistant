package com.hackathon.bpi.bpiassistant.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bpiassist")
public class BpiAssistantController {
    @GetMapping("/healthcheck")
    public String healthCheck(){
        return "BPI ASSISTANT";
    }
}
