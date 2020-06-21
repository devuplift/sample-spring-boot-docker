package com.example.sample.controller;

import com.example.sample.domain.Person;
import com.example.sample.service.PersonServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private PersonServiceImpl personServiceImpl;

    public PersonController(PersonServiceImpl personServiceImpl) {
        this.personServiceImpl = personServiceImpl;
    }

    @PostMapping(value = "/person", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void savePerson(@RequestBody Person person) {
         personServiceImpl.savePerson(person);
    }

    @GetMapping(value = "/persons", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> allPerson() {
        return personServiceImpl.allPerson();
    }

}
