package com.present;


public interface Methods {

    void addSweets(Sweets sweet);

    void delSweets(int sweetIndex);

    void delSweets(String sweetName);

    void showWeight();

    void showPrice();

    void showAllSweets();

    void reduceWeight(int weight);

    void reducePrice(int price);
}

