package com.company;

import com.company.people.Publisher;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Publisher p1 = new Publisher("Aux", "EU");
        p1.publishBook("1113");
        p1.publishBook("In the beginning");
        p1.getProducts();
    }
}
