package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Max Erling
 * Date: 2021-05-11
 * Copyright: MIT
 * Class: Java20B
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean adult;

}
