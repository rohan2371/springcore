package com.springcore.construtorinjection;

public class Person {
    private String name;
    private int personId;
    private Certificate cer;



    public Person(String name, int personId,Certificate cer)
    {
        this.name = name;
        this.personId  = personId;
        this.cer = cer;
    }
    public Person(){
        super();
    }

    @Override
    public String toString() {
        return this.name+" "+this.personId + this.cer;
    }
}
