package com.company;

import com.company.people.Developer;
import com.company.people.Publisher;
import com.company.people.User;

public class Main {

    public static void main(String[] args) {
        //generateBaseTest1();
        generateBaseTest2();
    }

    public static void generateBaseTest1(){
        Publisher p1 = new Publisher("Aux", "EU");
        Publisher p2 = new Publisher("Piet", "FR");
        Developer d1 = new Developer("Sam", "GB");
        Developer d2 = new Developer("Bao", "RU");

        p1.publishBook("1113");
        p1.publishBook("In the beginning");

        p2.publishBook("Economics");
        p2.publishBook("Wheat crisis in Bulgaria 1996");

        d1.developPhone("Naz");
        d1.developPhone("Miz");
        d1.developPhone("Ace");
        d1.developComputer("Lenses");
        d1.developComputer("Paras");
        d1.developComputer("Lenses");

        d2.developComputer("Pravetz");
        d2.developComputer("Neon");
        d2.developPhone("Ultra");
        d2.developPhone("EventLog");
        d2.developPhone("Downloads");
        d2.developComputer("Eclipse");

        p1.printProducts();
        p2.printProducts();
        d1.printProducts();
        d2.printProducts();
    }

    public static void generateBaseTest2(){
        Shop shop = new Shop();

        User u1 = new User("Peter", "DE");
        User u2 = new User("Matthew", "IS");

        Publisher p1 = new Publisher("Aux", "EU");
        Publisher p2 = new Publisher("Piet", "FR");
        Developer d1 = new Developer("Sam", "GB");
        Developer d2 = new Developer("Bao", "RU");

        p1.publishBook("1113");
        p1.publishBook("In the beginning");

        p2.publishBook("Economics");
        p2.publishBook("Wheat crisis in Bulgaria 1996");

        d1.developPhone("Naz");
        d1.developPhone("Miz");
        d1.developPhone("Ace");
        d1.developComputer("Lenses");
        d1.developComputer("Paras");

        d2.developComputer("Pravetz");
        d2.developComputer("Neon");
        d2.developPhone("Ultra");
        d2.developPhone("EventLog");
        d2.developPhone("Downloads");
        d2.developComputer("Eclipse");

        shop.addDeveloper(d1);
        shop.addPublisher(p1);
        shop.addPublisher(p2);
        shop.addDeveloper(d2);

        shop.printShopItems();

        shop.addUser(u1);
        shop.addUser(u2);


    }
}
