package com.company.people;

import com.company.entities.Book;
import java.util.ArrayList;

public class Publisher extends Producer{
    private ArrayList<Book> books;

    public Publisher(String name, String country){
        setName(name);
        setCountry(country);
        books = new ArrayList<>();
    }

    public void publishBook(String nameOfBook){
        Book book = new Book(nameOfBook, this);
        books.add(book);
    }

    @Override
    public void getProducts() {
        System.out.printf("%s", books.get(0).getName());
        for(int i=1; i < books.size(); ++i){
            System.out.printf(", %s", books.get(i).getName());
        }
        System.out.println();
    }
}
