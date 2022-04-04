package com.company;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink("Pina-colada",12,3.14, true);

        AlgoholDrink drink1 = new AlgoholDrink("zB-52", 50, 5, true, 20);
        BioDrink bioDrink = new BioDrink("zB-10000", 50, 1000, true, 20000000);


        Bar bar = new Bar();

        bar.add(drink);
        bar.add(drink1);
        bar.add(bioDrink);

        bar.add(new Drink("the best drink",32,55,true));
        bar.del(drink);

        bar.sort();
        bar.print();

        System.out.println();

        bar.sortByCost();
        bar.print();
    }
}