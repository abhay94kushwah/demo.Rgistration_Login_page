package com.Login.demo.Rgistration_Login_page.service;

import com.Login.demo.Rgistration_Login_page.model.User;
import com.Login.demo.Rgistration_Login_page.web_dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
