package com.company.people;

import com.company.entities.Computer;
import com.company.entities.Phone;
import java.util.ArrayList;

public class Developer extends Producer{
    ArrayList<Computer> computers;
    ArrayList<Phone> phones;

    public Developer(String name, String country){
        setName(name);
        setCountry(country);
        computers = new ArrayList<>();
        phones = new ArrayList<>();
    }

    @Override
    public void getProducts() {
        getComputers();
        getPhones();
    }

    public void getComputers(){
        System.out.printf("%s", computers.get(0).getName());
        for(int i=1; i < computers.size(); ++i){
            System.out.printf(", %s", computers.get(i).getName());
        }
        System.out.println();
    }

    public void getPhones(){
        System.out.printf("%s", phones.get(0).getName());
        for(int i=1; i < phones.size(); ++i){
            System.out.printf(", %s", phones.get(i).getName());
        }
        System.out.println();
    }
}
