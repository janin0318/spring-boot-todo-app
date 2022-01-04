package com.example.its.domain.auth;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public void insert(String username, String password) {
    userRepository.insert(username, password);
  }

}
