package com.mongodbapp.controller;

import com.mongodbapp.dto.CreateUserDTO;
import com.mongodbapp.dto.UpdateUserDTO;
import com.mongodbapp.model.User;
import com.mongodbapp.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.getRepository().findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody @Valid CreateUserDTO createUserDTO) {
        return ResponseEntity.ok(userService.create(createUserDTO));
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody @Valid UpdateUserDTO updateUserDTO) {
        return ResponseEntity.ok(userService.update(updateUserDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        userService.getRepository().deleteById(id);
        return ResponseEntity.ok().build();
    }

}
