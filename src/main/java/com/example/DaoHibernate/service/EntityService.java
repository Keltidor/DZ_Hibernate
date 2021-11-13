package com.example.DaoHibernate.service;

import com.example.DaoHibernate.model.Person;
import com.example.DaoHibernate.repository.EntityRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntityService {
    private final EntityRepository repository;


    public EntityService(EntityRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }

}
