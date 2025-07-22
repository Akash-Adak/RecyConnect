package com.recy.auth.controller;

import com.recy.auth.dto.*;
import com.recy.auth.repository.UserRepository;
import com.recy.auth.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")

public class AuthController {


    @Autowired
    private  UserRepository userRepository;


    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterRequest request) {
        if(userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalStateException("User already exists");
        }

       if( userService.addUser(request)) {
           return new ResponseEntity<>(HttpStatus.CREATED);
       }

        return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid LoginRequest request) {
        if(!userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalStateException("User does not  exists");
        }

        String token=userService.loginUser(request);
        if( token.equals(null)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(token,HttpStatus.FOUND);
    }
}
