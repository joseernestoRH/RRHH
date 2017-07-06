package com.TaurusSolution.Personal.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jose R Henriquez on 7/6/2017.
 */
@Configuration
public class Beans {

    @Bean
    public Person person()
    {
        return new Person();
    }
}
