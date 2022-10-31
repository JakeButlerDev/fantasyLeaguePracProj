package com.butler.fantasyLeaguePracProj.controllers;

import com.butler.fantasyLeaguePracProj.models.User;
import com.butler.fantasyLeaguePracProj.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<?> createOneUser(@RequestBody User newUser) {
        try {
            User createdUser = userRepository.save(newUser);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllUsers() {
        List<User> allUsers = userRepository.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        User foundUser = userRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        return new ResponseEntity<>(foundUser, HttpStatus.OK);
    }

    @PostMapping ("/{id}")
    public ResponseEntity<?> postOneTeamById(@PathVariable Long id, @RequestBody User updatedUserData) {
        User updatedUser = userRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        if (updatedUserData.getPassword() != null && !updatedUserData.getPassword().equals("")) {
            updatedUser.setPassword(updatedUserData.getPassword());
        }
        if (updatedUserData.getEmail() != null && !updatedUserData.getEmail().equals("")) {
            updatedUser.setEmail(updatedUserData.getEmail());
        }

            return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long id) {
        User deletedUser = userRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
        userRepository.deleteById(id);
        return new ResponseEntity<>(deletedUser, HttpStatus.OK);
    }
}
