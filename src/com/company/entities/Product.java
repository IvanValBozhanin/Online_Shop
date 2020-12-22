package com.company.entities;

import com.company.people.Producer;

public abstract class Product {
    private String name;
    private Producer producer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}
