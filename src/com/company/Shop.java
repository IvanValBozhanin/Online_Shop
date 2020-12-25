package com.company;

import com.company.entities.Product;
import com.company.people.Producer;
import com.company.people.User;

import java.util.ArrayList;

public class Shop {
    private ArrayList<User> users;
    private ArrayList<Producer> producers;
    private ArrayList<Product> products;

    public Shop(){
        users = new ArrayList<>();
        producers = new ArrayList<>();
        products = new ArrayList<>();
    }


}
