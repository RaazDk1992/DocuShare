package com.raazdk.Docushare.controller;

import com.raazdk.Docushare.dto.UserDTO;
import com.raazdk.Docushare.models.DocushareUser;
import com.raazdk.Docushare.security.requests.LoginRequest;
import com.raazdk.Docushare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/login")
    public ResponseEntity<List<DocushareUser>> Login(@RequestBody LoginRequest request){



            return new ResponseEntity(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/getuser/{id}")
    public ResponseEntity<UserDTO> getUserById(@RequestParam Long userid){
        return  new ResponseEntity(userService.getUserById(userid),HttpStatus.OK);
    }
}
