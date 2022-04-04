package com.company;

public class Drink implements Comparable<Drink>{
    String name;
    int value;
    double cost;
    boolean isEst;

    public Drink(String name, int value, double cost, boolean isEst) {
        this.name = name;
        setValue(value);
        this.cost = cost;
        this.isEst = isEst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value > 0)
            this.value = value;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isEst() {
        return isEst;
    }

    public void setEst(boolean est) {
        isEst = est;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", cost=" + cost + ","+
                ((isEst)?" в наличии": " не в наличии") +
                '}';
    }

    @Override
    public int compareTo(Drink o) {
        return name.compareTo(o.name);
    }
}

