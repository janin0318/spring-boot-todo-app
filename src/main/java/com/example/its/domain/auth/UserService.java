package com.example.its.domain.auth;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public void insert(String username, String password) {
    var encodedPassword = passwordEncoder.encode(password);
    userRepository.insert(username, encodedPassword);
  }

}
