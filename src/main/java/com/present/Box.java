package com.present;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Box implements Methods {

    private List<Sweets> sweets;
    private ArrayList<Integer> list;

    public Box() {
        sweets = new ArrayList<>();

    }

    public void addSweets(Sweets sweet) {
        sweets.add(sweet);
    }

    public void delSweets(int sweetIndex) {
        sweets.remove(sweetIndex);
    }

    public void delSweets(String sweetName) {
        Iterator<Sweets> iterator = sweets.iterator();
        while (iterator.hasNext()) {
            Sweets sweet = iterator.next();
            if (sweet.name.equals(sweetName)) {
                iterator.remove();
            }
        }
    }

    public void showWeight() {
        int weight = 0;
        for (Sweets s : sweets) {
            weight += s.weight;
        }
        System.out.println("Общий вес - " + weight + " грамм");
    }

    public void showPrice() {
        int price = 0;
        for (Sweets s : sweets) {
            price += s.price;
        }
        System.out.println("Общая цена - " + price + "рублей");
    }

    public void showAllSweets() {
        if (sweets.size() == 0) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("Конфеты в коробке");
            for (Sweets s : sweets) {
                System.out.println(s);
            }

        }
    }

    public void reduceWeight(int weight) {
        while (true) {
            int all = 0;
            for (Sweets s : sweets) {
                all += s.weight;
            }
            if (all > weight) {
                delMinWeightSweet();
            } else break;
        }
    }

    private void delMinWeightSweet() {
        list = new ArrayList<>();
        int minWeightSweet;
        for (Sweets s : sweets) {
            list.add(s.weight);
        }
        minWeightSweet = Collections.min(list);
        Iterator<Sweets> iterator = sweets.iterator();
        while (iterator.hasNext()) {
            Sweets sweet = iterator.next();
            if (sweet.weight == minWeightSweet) {
                iterator.remove();
                break;
            }
        }
    }

    public void reducePrice(int price) {
        while (true) {
            int all = 0;
            for (Sweets s : sweets) {
                all += s.price;
            }
            if (all > price) {
                delMinPriceSweet();
            } else break;
        }
    }

    private void delMinPriceSweet() {
        list = new ArrayList<>();
        int minPriceSweet;
        for (Sweets s : sweets) {
            list.add(s.price);
        }
        minPriceSweet = Collections.min(list);
        Iterator<Sweets> iterator = sweets.iterator();
        while (iterator.hasNext()) {
            Sweets sweet = iterator.next();
            if (sweet.price == minPriceSweet) {
                iterator.remove();
                break;
            }
        }
    }
}
