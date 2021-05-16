package com.example.springdocker.controller;

import com.example.springdocker.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-05-11
 * Copyright: MIT
 * Class: Java20B
 */
/*
@RequiredArgsConstructor
@RestController
public class PersonController {
    private final PersonService service;

    @GetMapping("/people")
    public List<Person> getPeople() {
        return  service.getPeople();
    }
    @PostMapping("/people")
    public void saveNewPerons(@RequestBody Person p) {
        service.saveNewPerson(p);
    }
    @GetMapping("/people/adult") 
        public List<String> getAdults() {
            return service.getPeople18AndAbove();
        }

}*/
