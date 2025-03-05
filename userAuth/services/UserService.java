package com.example.userAuth.services;

import com.example.userAuth.models.User;
import com.example.userAuth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // Marks this as a service layer
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user; // Valid credentials
        }

        return null; // Invalid credentials
    }

}

