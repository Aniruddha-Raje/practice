package com.study.practice.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("/all")
    public ResponseEntity<Object> getAll(){
        log.info("controller getAll");
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
