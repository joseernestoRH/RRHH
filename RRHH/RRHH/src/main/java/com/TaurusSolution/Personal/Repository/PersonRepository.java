package com.TaurusSolution.Personal.Repository;

import com.TaurusSolution.Personal.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Jose on 7/11/17.
 */
@Repository
public interface  PersonRepository  extends JpaRepository<Person, Long>{


    Person getByName(String name);

}
