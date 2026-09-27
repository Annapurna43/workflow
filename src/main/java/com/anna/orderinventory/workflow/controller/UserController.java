package com.anna.orderinventory.workflow.controller;

import com.anna.orderinventory.workflow.entity.UsersEntity;
import com.anna.orderinventory.workflow.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @GetMapping("/encodePassword")
    public void saveUserWithEncodedPassword(@RequestParam String username,
                                            @RequestParam String password){
        UsersEntity user = new UsersEntity();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        user.setIsActive(true);
        userRepository.save(user);
    }
}
