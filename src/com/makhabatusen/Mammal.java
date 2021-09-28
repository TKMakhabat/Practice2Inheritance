package com.makhabatusen;

public abstract class Mammal extends Animal{
    private String foodType;

    public Mammal(String name, int size, int age, String liveArea, String foodType) {
        super(name, size, age, liveArea);
        this.foodType = foodType;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("\nFood type: %s", foodType);
    }
}
