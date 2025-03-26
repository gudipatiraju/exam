package com.example.prepartion.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IntakeController
{

    @GetMapping("/greeting")
    public ResponseEntity<String> greetings()
    {
        return ResponseEntity.ok("Welcome to Azure Portal");
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> postMethodTest(@PathVariable String id)
    {
        String welcome = "Welcome to Azure Portal first message " + id;
        return ResponseEntity.ok(welcome);
    }
}
