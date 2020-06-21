package com.example.sample.mapper;

import com.example.sample.domain.Person;
import com.example.sample.entity.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public PersonEntity mapPersonToEntity(Person person) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setEmail(person.getEmail());
        personEntity.setFname(person.getFname());
        personEntity.setLastName(person.getLname());
        return personEntity;
    }

    public Person mapToPersonDomain(PersonEntity entity) {
        Person person = new Person();
        person.setEmail(entity.getEmail());
        person.setFname(entity.getFname());
        person.setLname(entity.getLastName());
        return person;
    }
}
