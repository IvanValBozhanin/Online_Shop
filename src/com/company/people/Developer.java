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

    public void developComputer(String nameOfComputer){
        try{
            Computer computer = new Computer(nameOfComputer, this);
            if(computers.contains(computer)){
                throw new Exception(String.format("——— Model '%s' already exists! ———", nameOfComputer));
            }
            computers.add(computer);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void developPhone(String nameOfPhone){
        try {
            Phone phone = new Phone(nameOfPhone, this);
            if(phones.contains(phone)){
                throw new Exception(String.format("——— Model '%s' already exists! ———", nameOfPhone));
            }
            phones.add(phone);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void printProducts() {
        printComputers();
        printPhones();
    }

    public void printComputers(){
        try {
            if (computers.isEmpty()) {
                throw new Exception(String.format("——— Developer '%s' has not developed any computer yet! ———", this.getName()));
            }
            System.out.printf("%s", computers.get(0).getName());
            for (int i = 1; i < computers.size(); ++i) {
                System.out.printf(", %s", computers.get(i).getName());
            }
            System.out.println();
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void printPhones(){
        try {
            if (phones.isEmpty()) {
                throw new Exception(String.format("——— Developer '%s' has not developed any phones yet! ———", this.getName()));
            }
            System.out.printf("%s", phones.get(0).getName());
            for (int i = 1; i < phones.size(); ++i) {
                System.out.printf(", %s", phones.get(i).getName());
            }
            System.out.println();
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }
}
