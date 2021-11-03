package com.example.demodeploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeployController {
    @GetMapping
    public String showView(){
        return "index";
    }
}
