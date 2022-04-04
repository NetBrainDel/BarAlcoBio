package com.company;

    public class AlgoholDrink extends Drink{

        int krep;

        public AlgoholDrink(String name, int value, double cost, boolean isEst, int krep) {
            super(name, value, cost, isEst);
            this.krep = krep;
        }

        @Override
        public String toString() {
            return  super.toString() +
                    "C`=" + krep +
                    '}';
        }
    }
