package com.anna.orderinventory.workflow.service;

import com.anna.orderinventory.workflow.entity.UsersEntity;
import com.anna.orderinventory.workflow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    public UsersEntity getUserFromUsername(String username){
    return userRepository.findByUsernameAndIsActive(username,true).orElseThrow(()->new UsernameNotFoundException("User not found!"));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsersEntity user = getUserFromUsername(username);
        return User.builder().username(user.getUsername())
                .password(user.getPassword())
                .authorities(Collections.emptyList())
                .build();
    }
}
