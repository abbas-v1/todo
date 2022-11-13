package com.abbas.health;

import org.springframework.web.bind.annotation.*;

/**
 * Controller for Test
 *
 * @author abbas
 */
@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "${cross.origin}")
public class TestController {

    @GetMapping
    public String getHealthStatus() {
        return "OK";
    }

}
