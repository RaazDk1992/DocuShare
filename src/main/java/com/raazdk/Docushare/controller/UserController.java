package com.raazdk.Docushare.controller;

import com.raazdk.Docushare.security.requests.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    AuthenticationManager manager;
    @PostMapping("/login")
    public ResponseEntity Login(@RequestBody LoginRequest request){



            return ResponseEntity.ok("Okay");
    }

}
