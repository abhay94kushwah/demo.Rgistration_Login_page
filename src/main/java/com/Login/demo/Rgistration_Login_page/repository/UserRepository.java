package com.Login.demo.Rgistration_Login_page.repository;

import com.Login.demo.Rgistration_Login_page.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
