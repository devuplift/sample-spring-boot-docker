package com.example.sample.service;

import com.example.sample.domain.Person;
import com.example.sample.entity.PersonEntity;
import com.example.sample.mapper.PersonMapper;
import com.example.sample.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;
    private PersonMapper personMapper;

    public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    @Override
    public void savePerson(Person person) {
        personRepository.save(personMapper.mapPersonToEntity(person));
    }

    @Override
    public List<Person> allPerson() {
        List<PersonEntity>  personEntities = personRepository.findAll();
        List<Person> personList = new ArrayList<>();
        for (PersonEntity personEntity : personEntities) {
            personList.add(personMapper.mapToPersonDomain(personEntity));
        }
        return personList;
    }
}
