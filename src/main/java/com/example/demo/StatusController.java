package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/status")
    public Map<String, String> getStatus() {
        return Collections.singletonMap("status", "OK");
    }
}