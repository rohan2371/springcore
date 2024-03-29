package com.springcore.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {


    @Autowired
    @Qualifier("temp1")
    private Address address;

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        System.out.println("setting value ");
        this.address = address;
    }


    public Emp(Address address) {
        this.address = address;
        System.out.println("inside the constructor");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

    public Emp(){
        super();
    }
}
