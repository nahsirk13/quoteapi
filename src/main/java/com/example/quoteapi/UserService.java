package com.example.quoteapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    // Constructor
    @Autowired //spring will inject user repo automatically
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Registers a new user in the system.
     * @param user The user to register.
     * @return The saved user object.
     * @throws IllegalArgumentException if the username is already taken.
     */
    public User registerUser(User user) {
      //check if user already exists
      if (userRepository.findByUsername(user.getUsername()) != null)   {
          throw new IllegalArgumentException("Username already taken");
      }
      return userRepository.save(user);
    }

    //login: takes username, pw params, returns positive if successful login
    public boolean login(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    //Get User By ID: uses optional to handle null exceptions
    public User getUserById(Long id) {
        Optional<User> result = userRepository.findById(id);
        return result.orElse(null);

    }





}
