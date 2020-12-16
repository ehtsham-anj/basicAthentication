package com.boot.fullstack1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.fullstack1.entity.User;
import com.boot.fullstack1.entity.repository.UserRepository;





@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	

	@Autowired
	UserRepository userRepository;

	
	
	@PostMapping("/signup")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
//	@PostMapping("/login")
//	public User loginUser(@RequestBody User user) {
//		return userRepository.findByUsername(username);
//	}
	
	
}


