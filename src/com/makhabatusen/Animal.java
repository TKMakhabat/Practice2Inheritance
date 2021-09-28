package com.makhabatusen;

public abstract class Animal {

    private String name;
    private int size;
    private int age;
    private String liveArea;

    public Animal(String name, int size, int age, String liveArea) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.liveArea = liveArea;
    }

    public void display(){
        System.out.printf("Name: %s \nSize: %d \nAge: %d \nLiving area: %s", name,size,age,liveArea);
    }

}
