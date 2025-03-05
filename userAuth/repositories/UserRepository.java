package com.example.userAuth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.userAuth.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
