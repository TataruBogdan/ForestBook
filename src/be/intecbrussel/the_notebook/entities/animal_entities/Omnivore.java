package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal{

    // Omnivore is a combination of a carnivore and a herbivore.
    // We therefore keep track of both a maxFoodSize and a plantDiet
    private Set<Plant> plantDiet;
    private double maxFoodSize;


    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.plantDiet = new HashSet<>();
        this.maxFoodSize = 0;
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant) {
        this.plantDiet.add(plant);
    }
}
