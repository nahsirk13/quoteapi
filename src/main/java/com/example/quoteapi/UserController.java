package com.example.quoteapi;

import com.example.quoteapi.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")  //class level mapping, so all mappings will  be under this
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    /**
     * Registers a new user in the system.
     * @param user The user to register. Request Body converts JSOn body to a User entity
     * @return The saved user object.
     */
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        boolean success = userService.login(request.getUsername(), request.getPassword());
        if (success) { return "Login successful"; }
        else{ return "Login failed"; }

    }


}
