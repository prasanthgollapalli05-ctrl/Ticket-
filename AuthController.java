package com.tickethub.controller;
import com.tickethub.model.User;
import com.tickethub.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins="*")
public class AuthController {
    private final UserService service;
    public AuthController(UserService service){this.service=service;}
    @PostMapping("/register")
    public User register(@RequestBody User user){return service.register(user);}
}