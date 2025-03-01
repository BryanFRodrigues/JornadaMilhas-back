package com.example.JornadaBack.Controller;

import com.example.JornadaBack.DataUser.User;

import com.example.JornadaBack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/teste")
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok("sucesso!");
    }

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/retorno")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
