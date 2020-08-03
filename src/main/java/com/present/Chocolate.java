package com.present;


public class Chocolate extends Sweets {
    private Type chocolateType;

    public Chocolate() {

    }

    public Chocolate(String name, int weight, int price, Type type) {
        super(name, weight, price);
        this.chocolateType = type;
    }

    public enum Type {
        SWEET("сладкий"), BITTER("горький");
        private String name;

        Type(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }


    public String toString() {
        return super.toString() + " " + chocolateType + "шоколад";
    }

}