package com.tvtracker.tvtrackerbackend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieDetailsController{
    
    @RequestMapping("/")
    public @ResponseBody String display(){
        return "Hello, World";
    }
}
