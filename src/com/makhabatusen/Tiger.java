package com.makhabatusen;

public class Tiger extends Predator {
    private String breedTiger;
    private String tailSize;

    public Tiger(String name, int size, int age, String liveArea, int speed, boolean havingTile, String huntingArea, String breedTiger) {
        super(name, size, age, liveArea, speed, havingTile, huntingArea);
        this.breedTiger = breedTiger;
        getTailSize(breedTiger);
    }

    public String getBreedTiger() {
        return breedTiger;
    }

    public void setBreedTiger(String breedTiger) {
        this.breedTiger = breedTiger;
    }

    public String getTailSize() {
        return tailSize;
    }

    public void setTailSize(String tailSize) {
        this.tailSize = tailSize;
    }

    private void getTailSize(String breedTiger) {
       this.tailSize =  switch (breedTiger) {
            case "Amur tiger" -> tailSize = "Longest tail";
            case "Sumatran tiger" -> tailSize = "shortest size tail»";
            default -> tailSize = "middle size tail";
        };

    }

    @Override
    public void display() {
        super.display();
        System.out.printf("\nBreedTiger: %s \nTail Size: %s", breedTiger, tailSize);
    }
}
