package com.TaurusSolution.Personal.Beans;

import com.TaurusSolution.Personal.Services.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jose R Henriquez on 7/6/2017.
 */
@Configuration
public class Beans {

    @Bean
    public com.TaurusSolution.Personal.entities.Person person()
    {
        return new com.TaurusSolution.Personal.entities.Person();
    }

    @Bean
    public PersonService personService()
    {
        return new PersonService();
    }


}
