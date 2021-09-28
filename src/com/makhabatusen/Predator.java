package com.makhabatusen;

public abstract class Predator  extends Animal{
    private int speed;
    private boolean havingTile;
    private String huntingArea;

    public Predator(String name, int size, int age, String liveArea, int speed, boolean havingTile, String huntingArea) {
        super(name, size, age, liveArea);
        this.speed = speed;
        this.havingTile = havingTile;
        this.huntingArea = huntingArea;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("\nSpeed: %d \nHave tail: %b \nHunting area: %s ", speed, havingTile, huntingArea);
    }
}
