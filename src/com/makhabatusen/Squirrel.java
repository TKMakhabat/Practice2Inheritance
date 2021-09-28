package com.makhabatusen;

public class Squirrel extends Mammal {
    private String breedSquirrel;
    private String color;

    public Squirrel(String name, int size, int age, String liveArea, String foodType, String breedSquirrel) {
        super(name, size, age, liveArea, foodType);
        this.breedSquirrel = breedSquirrel;
        getColorSquirrel(breedSquirrel);
    }

    public String getBreedSquirrel() {
        return breedSquirrel;
    }

    public void setBreedSquirrel(String breedSquirrel) {
        this.breedSquirrel = breedSquirrel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void getColorSquirrel(String breedSquirrel) {
        this.color = switch(breedSquirrel) {
            case "Black Squirrel" -> "Black";
            case "White Squirrel" -> "White";
            default -> "Brown";
        };
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("\n Breed Squirrel: %s \nColor: %s", breedSquirrel, color);
    }
}
