package com.discord.discria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.discord.discria.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
