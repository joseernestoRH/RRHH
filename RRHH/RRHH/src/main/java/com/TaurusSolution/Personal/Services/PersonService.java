package com.TaurusSolution.Personal.Services;


import com.TaurusSolution.Personal.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import com.TaurusSolution.Personal.entities.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jose R Henriquez on 7/6/2017.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public List<Person> findAllPersons()
    {
        return personRepository.findAll();
    }


}
