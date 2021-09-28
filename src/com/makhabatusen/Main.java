package com.makhabatusen;

public class Main {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Tiger", 20, 5, "Africa", 80, true, "Somewhere", "Amur tiger");
        Squirrel squirrel = new Squirrel("Squirrel", 12, 2, "KG", "nuts", "White Squirrel");

        tiger.display();
        System.out.println("\n_____");
        squirrel.display();
    }
}
