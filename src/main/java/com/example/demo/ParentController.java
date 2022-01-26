package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
@RequiredArgsConstructor
public class ParentController {
    private final ParentRepository parentRepository;

    @PostMapping("/parents/create")
    public ResponseEntity<Parent> createParent(@RequestBody Parent parent){
        return ResponseEntity.status(HttpStatus.CREATED).body(parentRepository.save(parent));
    }
}
