package com.present;

public class Main {
    public static void main(String[] args) {

        Methods methods = new Box();
        methods.addSweets(new Candy("Аленка", 200, 120, 150));
        methods.addSweets(new Chocolate("Милка", 100, 150, Chocolate.Type.SWEET));
        methods.addSweets(new Chocolate("Бабаевский", 100, 100, Chocolate.Type.BITTER));
        methods.addSweets(new Gum("Эклипс", 15, 35, 10));
        methods.showWeight();
        methods.showPrice();
        methods.showAllSweets();
        methods.delSweets("Бабаевский");
        methods.showAllSweets();

    }
}