package com.present;


public class Candy extends Sweets {

    private int calories;

    public Candy() {

    }

    public Candy(String name, int weight, int price, int calories) {
        super(name, weight, price);
        this.calories = calories;

    }


    public String toString() {
        return super.toString() + " " + calories + "калории";
    }


}