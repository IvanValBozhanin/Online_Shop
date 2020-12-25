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
                //throw new Exception(String.format("——— The wishlist of %s does not contain anything! ———"));
            }

        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
