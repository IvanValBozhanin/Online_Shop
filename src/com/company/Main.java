package com.company;

import com.company.people.Developer;
import com.company.people.Producer;
import com.company.people.Publisher;

public class Main {

    public static void main(String[] args) {
        Publisher p1 = new Publisher("Aux", "EU");
        p1.publishBook("1113");
        p1.publishBook("In the beginning");
        p1.getProducts();
        Producer d1 = new Developer("Sam", "GB");
    }
}
