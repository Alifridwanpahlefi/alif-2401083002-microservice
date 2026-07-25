package com.alif.authentication.controller;

import com.alif.authentication.dto.AuthRequest;
import com.alif.authentication.dto.AuthResponse;
import com.alif.authentication.entity.User;
import com.alif.authentication.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User register(@RequestBody AuthRequest request) {
        
        return authService.register(request.getUsername(), request.getPassword());
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        String token = authService.login(
            request.getUsername(),
            request.getPassword()
        );

        return new AuthResponse(token);
    }
}