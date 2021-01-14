package com.company;

import com.company.entities.Book;
import com.company.entities.Computer;
import com.company.entities.Phone;
import com.company.entities.Product;
import com.company.people.Developer;
import com.company.people.Publisher;
import com.company.people.User;

import java.util.ArrayList;

public class Shop {
    private ArrayList<User> users;
    private ArrayList<Developer> developers;
    private ArrayList<Publisher> publishers;
    private ArrayList<Product> products;

    public Shop(){
        users = new ArrayList<>();
        developers = new ArrayList<>();
        publishers = new ArrayList<>();
        products = new ArrayList<>();
    }

    public Shop(ArrayList<User> users, ArrayList<Developer> developers, ArrayList<Publisher> publishers, ArrayList<Product> products) {
        this.users = users;
        this.developers = developers;
        this.publishers = publishers;
        this.products = products;
    }

    public void addPublisher(Publisher p){
        publishers.add(p);
    }

    public void addDeveloper(Developer d){
        developers.add(d);
    }

    public void addUser(User u){
        users.add(u);
    }

    public void printShopItems(){
        printBooks();
        printComputers();
        printPhones();
    }

    public void printBooks(){
        System.out.println("Books:");
        for(Publisher publisher: publishers){
            System.out.printf("%s (%s): ", publisher.getName(), publisher.getCountry());
            publisher.printProducts();
        }
    }

    public void printComputers(){
        System.out.println("Computers:");
        for(Developer developer: developers){
            System.out.printf("%s (%s): ", developer.getName(), developer.getCountry());
            developer.printComputers();
        }
    }

    public void printPhones(){
        System.out.println("Phones:");
        for(Developer developer: developers){
            System.out.printf("%s (%s): ", developer.getName(), developer.getCountry());
            developer.printPhones();
        }
    }
}
