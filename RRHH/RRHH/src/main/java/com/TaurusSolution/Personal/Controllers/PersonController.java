package com.TaurusSolution.Personal.Controllers;

import com.TaurusSolution.Personal.Beans.Person;
import com.TaurusSolution.Personal.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Jose R Henriquez on 7/6/2017.
 */
@RestController
@RequestMapping(value= "/Persons")
public class PersonController {
    @Autowired
    private PersonService  personService;


    @RequestMapping(value = "/GetAll")
    public List<Person> getAllPerson()
    {
        return personService.getPersons();
    }

}
