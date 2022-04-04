package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bar {
    ArrayList<Drink> drinks = new ArrayList<>();

    public void add(Drink d){
        drinks.add(d);
    }
    public void del(Drink artem){
        drinks.remove(artem);
    }

    public void print(){
        for(Drink dr:drinks)
            System.out.println(dr);
    }

    public void printEst(){
        for(Drink dr:drinks){
            if(dr.isEst())
                System.out.println(dr);
        }
    }

    public void sort(){
        Collections.sort(drinks);
    }

    public void sortByCost(){
        Collections.sort(drinks, new PraviloSrotByCost());
    }
    class PraviloSrotByCost implements Comparator<Drink> {

        @Override
        public int compare(Drink o1, Drink o2) {
            return (int)(o1.getCost()-o2.getCost());
        }
    }
}
