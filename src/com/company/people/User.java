package com.company.people;

import com.company.entities.Product;
import com.company.lists.Cart;
import com.company.lists.WishList;

public class User{
    private String name;
    private String country;
    private Cart cart;
    private WishList wishList;

    public User(String name, String country) {
        this.name = name;
        this.country = country;
        this.cart = new Cart();
        this.wishList = new WishList();
    }

    public void printCartItems(){
        System.out.printf("%s's Cart:\n", this.name);
        cart.printList();
        System.out.println();
    }

    public void printWishListItems(){
        System.out.printf("%s's Wish List:\n", this.name);
        wishList.printList();
        System.out.println();
    }

    public void purchaseAll(){
        System.out.print("Added to checkout items from ");
        printCartItems();
        cart.clear();
    }

    public void addToCart(Product product){
        cart.addProduct(product);
    }

    public void addToWishList(Product product){
        wishList.addProduct(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public WishList getWishList() {
        return wishList;
    }

    public void setWishList(WishList wishList) {
        this.wishList = wishList;
    }
}
