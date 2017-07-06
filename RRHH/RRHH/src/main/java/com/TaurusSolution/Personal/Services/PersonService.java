package com.TaurusSolution.Personal.Services;

import com.TaurusSolution.Personal.Beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jose R Henriquez on 7/6/2017.
 */
@Service
public class PersonService {

    @Autowired
    private Person person;

    public List<Person> getPersons()
    {

        person.setAddress("jose");
        person.setLastName("Rodriguez");
        person.setAddress("mi casa");
        person.setBithDate(new Date());

        List<Person> personList = new LinkedList<Person>();
        personList.add(person);

        return personList;
    }


}
