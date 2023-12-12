package com.example.gpt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @GetMapping("/")
    @ResponseBody
    public String test() {
        return "Hello!";
    }

    @GetMapping("/dbConnect/Test")
    @ResponseBody
    public String dbConntectTest() {

        return "완료";
    }

}
