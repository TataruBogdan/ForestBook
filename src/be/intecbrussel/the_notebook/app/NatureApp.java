package be.intecbrussel.the_notebook.app;

//TODO The idea is that you take on the role of a forest walker. During your relaxing Sunday morning walk,
// you will come face to face with a number of animals and plants.
// You carefully measure all the properties of the animals and plants.
// And keep track of these animals and plants in your notebook.

import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.HashSet;
import java.util.Set;

public class NatureApp {

    public static void main(String[] args) {

        // Create an instance of Notebook and give it a meaningful name.
        ForestNotebook myNotebook = new ForestNotebook();

        // Create at least 5 different plants, make sure you have at least
        // 1 Three, Flower, Weed and Bush object.
        // [use the correct constructor for this, as well as methods to keep track of all measurements]
        Tree eucalyptus = new Tree("Eucalyptus", 10);
        eucalyptus.setLeafType(LeafType.ROUND);
        myNotebook.addPlant(eucalyptus);

        Tree oak = new Tree("Oak", 10);
        oak.setLeafType(LeafType.HAND);
        myNotebook.addPlant(oak);

        Tree fir = new Tree("Fir", 2);
        fir.setLeafType(LeafType.NEEDLE);
        myNotebook.addPlant(fir);

        Flower rose = new Flower("Rose", 0.15);
        rose.setSmell(Scent.SWEET);
        myNotebook.addPlant(rose);

        Flower monkeyFlower = new Flower("Musk", 0.30);
        monkeyFlower.setSmell(Scent.MUSKY);
        myNotebook.addPlant(monkeyFlower);

        Flower pineappleWeed = new Flower("Hibiscus Pineapple", 0.40);
        pineappleWeed.setSmell(Scent.PINEAPPLE);
        myNotebook.addPlant(pineappleWeed);

        Bush snowdrops = new Bush("SnowBall", 0.05);
        snowdrops.setLeafType(LeafType.SPEAR);
        myNotebook.addPlant(snowdrops);

        Bush rhododendron  = new Bush("Rhododendron", 1);
        rhododendron.setLeafType(LeafType.ROUND);
        myNotebook.addPlant(rhododendron);

        Weed bamboo = new Weed("Bamboo", 10);
        bamboo.setArea(2.00);
        myNotebook.addPlant(bamboo);

        Weed dandelion = new Weed("Dandelion");
        dandelion.setArea(0.50);
        myNotebook.addPlant(dandelion);

        Set<Plant> herbivoreDiet = new HashSet<>();
        herbivoreDiet.add(eucalyptus);
        herbivoreDiet.add(bamboo);
        herbivoreDiet.add(dandelion);
        herbivoreDiet.add(pineappleWeed);

        Herbivore elephant = new Herbivore("Elephant", 6300, 4, 5);
        elephant.setPlantDiet(herbivoreDiet);
        elephant.addPlantToDiet(fir);
        //System.out.println("Elephant diet has: " +  elephant.getPlantDiet());
        elephant.printDiet();
        myNotebook.addAnimal(elephant);

        Herbivore panda = new Herbivore("Panda", 100, 90, 1.9);
        panda.addPlantToDiet(bamboo);
        panda.printDiet();
        myNotebook.addAnimal(panda);

        Herbivore hippopotamus = new Herbivore("Hippo", 3000, 1.5, 4);
        hippopotamus.addPlantToDiet(rhododendron);
        hippopotamus.addPlantToDiet(oak);
        hippopotamus.setPlantDiet(herbivoreDiet);
        hippopotamus.printDiet();
        myNotebook.addAnimal(hippopotamus);

        Herbivore hippopotamus1 = new Herbivore("Hippo", 3000, 1.5, 4);
        myNotebook.addAnimal(hippopotamus1);

        System.out.println("Plant count: " + myNotebook.getPlantCount());
        System.out.println("Animal count: " + myNotebook.getAnimalCount());

    }
}
