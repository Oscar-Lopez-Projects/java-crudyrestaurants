package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;

//In this file, you connect menu to Restaurant.

@Entity
@Table(name = "menus")
public class Menu {

    //generate a unique key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long menuid;

    //make sure the colum is never empty & create values
    @Column(nullable = false)
    private String dish;
    private double price;

    //this has to match Restaurant id on line 21-22
   @ManyToOne
    @JoinColumn(name = "restaurantid",nullable = false)
    private Restaurant restaurant;

    //this will be explain later on why to have
    public Menu() {
    }

    //setting up the constructor
    public Menu(String dish, double price, Restaurant restaurant) {
        this.dish = dish;
        this.price = price;
        this.restaurant = restaurant;
    }

    //getters and setters
    public long getMenuid() {
        return menuid;
    }

    public void setMenuid(long menuid) {
        this.menuid = menuid;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
