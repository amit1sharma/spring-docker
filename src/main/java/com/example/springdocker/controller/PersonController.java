package com.example.springdocker.controller;

import com.example.springdocker.dto.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping(value="/persons")
    public ResponseEntity<Person> getPersons(){
        List<Person> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new Person("amit"+i,18,i));
        }
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
