package com.company.entities;

import com.company.people.Publisher;

public class Book extends Product{

    public Book(String nameOfBook, Publisher publisher){
        setName(nameOfBook);
        setProducer(publisher);
    }
}
