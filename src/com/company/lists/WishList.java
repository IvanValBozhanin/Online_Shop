package com.company.lists;

import java.util.ArrayList;

public class WishList extends ProductContainer{

    public WishList(){
        products = new ArrayList<>();
    }

    @Override
    public void printList() {
        try{
            if(products.isEmpty()){
                throw new Exception("——— Your wishlist does not contain anything! ———");
            }
            System.out.printf("%s", products.get(0).getName());
            for(int i=1; i < products.size(); ++i){
                System.out.printf(", %s", products.get(i).getName());
            }
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
