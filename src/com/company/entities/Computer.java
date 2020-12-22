package com.company.entities;

import com.company.people.Developer;

public class Computer extends Product{

    public Computer(String name, Developer developer){
        setName(name);
        setProducer(developer);
    }
}
