package com.namng.jwttokenintro.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("user".equals(username)) {
            return new User("user", "$2a$10$J8yZ1nD5dzUviFb1cKwGuOiT1x3OtC8q3T8B7sZp06PjE5BsIdJKa", new ArrayList<>()); // password is "password" encoded
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
