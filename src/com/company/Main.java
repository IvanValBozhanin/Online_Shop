package com.company;

import com.company.people.Developer;
import com.company.people.Publisher;

public class Main {

    public static void main(String[] args) {
        generateBase();

    }

    public static void generateBase(){
        Publisher p1 = new Publisher("Aux", "EU");
        p1.publishBook("1113");

        p1.publishBook("In the beginning");
        p1.printProducts();
        Developer d1 = new Developer("Sam", "GB");
        d1.developPhone("Naz");
        d1.developPhone("Miz");
        d1.developPhone("Ace");
        d1.developComputer("Lenses");
        d1.developComputer("Paras");
        d1.developComputer("Lenses");
        d1.printProducts();

    }
}
