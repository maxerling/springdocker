package com.example.springdocker.controller;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Max Erling
 * Date: 2021-05-21
 * Copyright: MIT
 * Class: Java20B
 */
/*@RestController
public class AppController {

    //@Value("${spring.profiles.active}")
    private String actiVeProfile;
    //@Value("${database.name}")
    private String dbname;
    //@Value("${default.prop}")
    private String defaultProp;

    @GetMapping("/env")
    public Response getEnvProfile() { return new Response(actiVeProfile,dbname,defaultProp);}

    @Data
    @AllArgsConstructor
    class Response {
        String profile;
        String databaseName;
        String defaultProp;
    }
}*/
