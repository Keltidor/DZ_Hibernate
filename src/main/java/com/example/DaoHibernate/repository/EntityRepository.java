package com.example.DaoHibernate.repository;

import com.example.DaoHibernate.model.Person;
import com.example.DaoHibernate.model.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface EntityRepository extends JpaRepository<Person, PersonId> {

    List<Person> findByCityOfLiving(String city);

    @SuppressWarnings("SpringDataMethodInconsistencyInspection")
    Optional<Person> findPersonByPersonId_NameAndAndPersonId_Surname(String name, String surname);

    List<Person> findAllByPersonId_AgeLessThanOrderByPersonId_Age(int age);

}
