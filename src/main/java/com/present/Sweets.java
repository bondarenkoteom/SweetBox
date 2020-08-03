package com.present;


public class Sweets {
    protected String name;
    protected int weight;
    protected int price;


    public Sweets() {

    }

    public Sweets(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }


    public String toString() {
        return name + " " + weight + "грамм" + " " + price + "рублей";
    }


}
