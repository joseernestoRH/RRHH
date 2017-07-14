package com.TaurusSolution.Personal.Repository;

import com.TaurusSolution.Personal.entities.Person;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Jose on 7/11/17.
 */
@Repository
public class  PersonRepository{

    @PersistenceContext
    private EntityManager entityManager;


    public List<Person> getAll()
    {
        String hql = "from Person";
        return entityManager.createQuery(hql).getResultList();
    }


}
