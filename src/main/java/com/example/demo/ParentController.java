package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1")
@RequiredArgsConstructor
public class ParentController {
    private final ParentRepository parentRepository;

    @PostMapping("/parents/create")
    public ResponseEntity<Parent> createParent(@RequestBody Parent parent){
        return ResponseEntity.status(HttpStatus.CREATED).body(parentRepository.save(parent));
    }

    @GetMapping("/parents/{parentId}")
    public ResponseEntity<Parent> getParentById(@PathVariable(value = "parentId") Integer parentId){
        Optional<Parent>parent = parentRepository.findById(parentId);
        return ResponseEntity.status(HttpStatus.FOUND).body(parent.get());
    }
}
