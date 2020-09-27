package com.abbas.todo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Controller for Test
 *
 * @author abbas
 */
@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "http://ec2-18-218-206-209.us-east-2.compute.amazonaws.com")
public class TestController {

    @GetMapping
    public String getHealthStatus() {
        return "OK";
    }

}
