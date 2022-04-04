package com.company;

public class BioDrink extends Drink{

    int kkal;

    public BioDrink(String name, int value, double cost, boolean isEst, int kkal) {
        super(name, value, cost, isEst);
        this.kkal = kkal;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "kkal= " + kkal +
                '}';
    }
}