package com.TaurusSolution.Personal.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Jose R Henriquez on 7/6/2017.
 */
@Component
public class Person {

    private String name;
    private String LastName;
    private Date BithDate;
    private String Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getBithDate() {
        return BithDate;
    }

    public void setBithDate(Date bithDate) {
        BithDate = bithDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }



}
