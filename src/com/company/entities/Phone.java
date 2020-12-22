package com.company.entities;

import com.company.people.Developer;

public class Phone extends Product{

    public Phone(String name, Developer developer){
        setName(name);
        setProducer(developer);
    }
}
