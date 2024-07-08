package com.namng.jwttokenintro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            return new User("user", "$2a$10$ASVNzT4SSUS7V0ZAe.VXQ.21RpYtANcoWIxcDRm3dR5zEa8OvyFR6", new ArrayList<>()); // password is "password" encoded
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

//    public void addNewUser(UserDetails userDetails){
//        System.out.println(userDetails.getUsername() + "------" + passwordEncoder.encode(userDetails.getPassword()));
//    }


}
