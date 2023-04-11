package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {

    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;


    //TODO TIP: You can choose which concrete implementation you foresee for the list
    // [read: ArrayList or LinkedList] for the various properties carnivores, herbivores, omnivores, plants and animals
    public ForestNotebook() {
        this.carnivores = new ArrayList<>();
        this.omnivores = new ArrayList<>();
        this.herbivores = new ArrayList<>();
        this.plantCount = 0;
        this.animalCount = 0;
        this.animals = new ArrayList<>();
        this.plants = new ArrayList<>();
    }

    public List<Carnivore> getCarnivores() {
        return new ArrayList<>(carnivores);
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return new ArrayList<>(omnivores);
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return new ArrayList<>(herbivores);
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    // TODO - the plantCount method returns the number of plants we track internally
    public int getPlantCount() {
        return plants.size();
    }

    //TODO - the animalCount method returns the amount of animals we track internally
    public int getAnimalCount() {
        return animals.size();
    }

    //TODO The methods of adding plants and animals must have a control mechanism.
    // They must check that the same animal is not added twice. [compare the name]
    // TIP: You get an Animal animal argument in the addAnimal method,
    // which must be added to both the animals list and the correct internal list
    // [so in carnivores, herbivores or omnivores].
    public void addAnimal(Animal animal) {


        // guard code
        if (animal == null) {
            System.out.println("Cannot add animal - null");
            return;
        }
        // guard code
        if (existAnimal(animal)){
            System.out.println("Animal already exists " + animal.getName());
            return;
        }

        if (animal instanceof Carnivore) {
            Carnivore carnivore = (Carnivore) animal;
            this.carnivores.add(carnivore);
            addToAnimalList(animal);
            System.out.println("Carnivore added");
        } else if (animal instanceof Herbivore) {
            Herbivore herbivore = (Herbivore) animal;
            this.herbivores.add(herbivore);
            addToAnimalList(animal);
            System.out.println("Herbivore added");
        } else if (animal instanceof Omnivore) {
            Omnivore omnivore = (Omnivore) animal;
            this.omnivores.add(omnivore);
            addToAnimalList(animal);
            System.out.println("Omnivore added");
        } else {
            System.out.println("Cannot add animal");
        }
        //TODO - to much repetitive code !
//        if (!animals.isEmpty() && animal != null) {
//            if (animal instanceof Carnivore) {
//                boolean foundCarnivore = false;
//                for (Carnivore carnivore : this.carnivores) {
//                    if (animal.getName().compareToIgnoreCase(carnivore.getName()) == 0) {
//                        foundCarnivore = true;
//                        System.out.println("Animal already exist: " + animal.getName());
//                        break;
//                    }
//                }
//                if (!foundCarnivore) {
//                    System.out.println("Carnivore added");
//                    this.carnivores.add((Carnivore) animal);
//                    //add animal to the animal list
//                    this.animals.add(animal);
//                    System.out.println("Animal added");
//                }
//
//            } else if (animal instanceof Herbivore) {
//                boolean foundHerbivore = false;
//                for (Herbivore herbivore : this.herbivores) {
//                    if (animal.getName().compareToIgnoreCase(herbivore.getName()) == 0) {
//                        foundHerbivore = true;
//                        System.out.println("Animal already exist: " + animal.getName());
//                        break;
//                    }
//                }
//                if (!foundHerbivore) {
//                    System.out.println("Herbivore added");
//                    this.herbivores.add((Herbivore) animal);
//                    //add animal to the animal list
//                    this.animals.add(animal);
//                    System.out.println("Animal added");
//                }
//            } else if (animal instanceof Omnivore) {
//                boolean foundOmnivore = false;
//                for (Omnivore herbivore : this.omnivores) {
//                    if (animal.getName().compareToIgnoreCase(herbivore.getName()) == 0) {
//                        foundOmnivore = true;
//                        System.out.println("Animal already exist: " + animal.getName());
//                        break;
//                    }
//                }
//                if (!foundOmnivore) {
//                    System.out.println("Omnivore added");
//                    this.omnivores.add((Omnivore) animal);
//                    //add animal to the animal list
//                    this.animals.add(animal);
//                    System.out.println("Animal added");
//                }
//            }
//        } else {
//            if (animal instanceof Carnivore) {
//                this.carnivores.add((Carnivore) animal);
//            } else if (animal instanceof Herbivore) {
//                this.herbivores.add((Herbivore) animal);
//            } else if (animal instanceof Omnivore) {
//                this.omnivores.add((Omnivore) animal);
//            } else {
//                System.out.println("Cannot add animal");
//            }
//            animals.add(animal);
//            System.out.println("Animal added");
//        }
    }

    // check to see if the animal exist in animals
    private boolean existAnimal(Animal animal) {
        for (Animal existingAnimal : animals) {
            if (existingAnimal.getName().equalsIgnoreCase(animal.getName())){
                return true;
            }
        }
        return false;
    }

    private void addToAnimalList(Animal animal) {
        this.animals.add(animal);
        System.out.println("Animal added");
    }

    public void addPlant(Plant plant) {

        if (!this.plants.contains(plant) && plant != null) {
            this.plants.add(plant);
        } else {
            System.out.println("Cannot add plant, already exist or null");
        }
    }

    //TODO - the printNotebook method prints all plants and animals.
    // [you can do this in different ways, try to choose the best strategy yourself]
    public void printNoteBook() {
        for (Animal animal : animals) {
            System.out.println("Animal in Notebook: " + animal);
        }

        for (Plant plant : plants) {
            System.out.println("Plant in Notebook: " + plant);
        }
    }

    //TODO - sortAnimalsByName method sorts the internal animal list by name.
    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    //TODO - sortPlantsByName method sorts the internal plant list by name
    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
    }


    //TODO BONUS [only if time left]
    // create a sortAnimalsByHeight method and a sortPlantsByHeight method
    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
    }


}
