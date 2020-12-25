package com.company.lists;

import com.company.entities.Product;
import com.company.people.User;

import java.util.ArrayList;

public abstract class ProductContainer {
    protected ArrayList<Product> products;
    protected User user;

    public void addProduct(Product product){
        try {
            if(products.contains(product)){
                throw new Exception(String.format("——— Product '%s' is already added! ———", product.getName()));
            }
            products.add(product);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public void removeProduct(Product product){
        try{
            if(!products.contains(product)){
                throw new Exception(String.format("——— Product '%s' is not added yet! ———", product.getName()));
            }
            products.remove(product);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public abstract void printList();
}
