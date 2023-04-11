package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.Objects;

public class Carnivore extends Animal{

    // we will keep track of the maximum size of the prey that this animal can eat.
    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.maxFoodSize = 0;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore: " +
                "name='" + name + '\'' +
                ", maxFoodSize=" + maxFoodSize +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length;
    }
}
