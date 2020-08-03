package com.present;


public class Gum extends Sweets {

    private int countGum;

    public Gum() {

    }

    public Gum(String name, int weight, int price, int countGum) {
        super(name, weight, price);
        this.countGum = countGum;
    }


    public String toString() {
        return super.toString() + " " + countGum + "штук в упаковке";
    }

}
