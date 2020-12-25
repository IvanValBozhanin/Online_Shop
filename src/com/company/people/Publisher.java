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
        try {
            Book book = new Book(nameOfBook, this);
            if(books.contains(book)){
                throw new Exception(String.format("——— Model '%s' already exists! ———", nameOfBook));
            }
            books.add(book);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void printProducts() {
        try{
            if(books.isEmpty()){
                throw new Exception(String.format("——— Publisher '%s' has not published any books yet! ———", this.getName()));
            }
            System.out.printf("%s", books.get(0).getName());
            for(int i=1; i < books.size(); ++i){
                System.out.printf(", %s", books.get(i).getName());
            }
            System.out.println();
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
