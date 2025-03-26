package com.example.prepartion.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IntakeController
{

    @GetMapping("/greeting")
    public ResponseEntity<String> greentings()
    {
        return ResponseEntity.ok("This is testing at Azure Portal");
    }
}
