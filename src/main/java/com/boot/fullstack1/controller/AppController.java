package com.boot.fullstack1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.boot.fullstack1.entity.repository.UserRepository;
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/auth")
@RestController
public class AppController {
	 
    @Autowired
//    private UserRepository userRepo;
     
    @GetMapping("/")
    public String viewHomePage() {
        return "this is home page";
    }
    
    @GetMapping("/users")
    public String login() {
        return "this is login page";
    }
    @GetMapping("/home")
    public String logout() {
        return "this is logout page";
    }
    @PostMapping("/register")
    public String signup() {
        return "";
    }
}