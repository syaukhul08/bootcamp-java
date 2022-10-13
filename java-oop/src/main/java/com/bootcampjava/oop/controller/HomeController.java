package com.bootcampjava.oop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<Object> index() {
        return ResponseEntity.ok()
                .body("Welcome to Spring");
    }

}
