package com.example.sample.service;


import com.example.sample.domain.Person;

import java.util.List;

public interface PersonService {

    void savePerson(Person person);
    List<Person> allPerson();
}
