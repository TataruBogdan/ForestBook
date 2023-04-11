package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Herbivore extends Animal{

    // set where we can store different plants. T
    // these plants represent the plants that a herbivore eats.
    Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
        this.plantDiet = new HashSet<>();
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.plantDiet = new HashSet<>();
    }

    public Set<Plant> getPlantDiet() {
        return new HashSet<>(plantDiet);
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    // addPlantToDiet method allows a user to add a plant, we will track it internally in our plantDiet property.
    public void addPlantToDiet(Plant plant){
        boolean addPlant = plantDiet.add(plant);// check if we already added to our diet
        if (addPlant) {
            System.out.println("Plant added ");
        } else {
            System.out.println("Plant already added to the diet");
        }
    }

    public void printDiet() {

        Iterator<Plant> plantIterator = getPlantDiet().iterator();
        System.out.println("Herbivore " + name + " diet: ");
        while (plantIterator.hasNext()) {
            System.out.println("     " + plantIterator.next());
        }
    }

    @Override
    public String toString() {
        return "Herbivore: " +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length;
    }
}
