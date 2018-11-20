package com.divashchenko;

public class Object {
    private int weight;
    private int price;

    public Object(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Object{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
