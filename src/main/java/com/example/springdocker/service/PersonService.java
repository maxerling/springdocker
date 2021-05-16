package com.example.springdocker.service;

import com.example.springdocker.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Max Erling
 * Date: 2021-05-11
 * Copyright: MIT
 * Class: Java20B
 */
/*
@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository repository;

    public List<Person> getPeople()  {
        return repository.findAll();
    }

    public void saveNewPerson(Person p) {
        repository.save(p);
    }

    public List<String> getPeople18AndAbove() {
        List<Person> adultPeople = repository.findPeopleBy18andAbove(true);

        return adultPeople.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());
    }


}*/
