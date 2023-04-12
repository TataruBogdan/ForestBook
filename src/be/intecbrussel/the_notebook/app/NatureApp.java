package be.intecbrussel.the_notebook.app;

//TODO The idea is that you take on the role of a forest walker. During your relaxing Sunday morning walk,
// you will come face to face with a number of animals and plants.
// You carefully measure all the properties of the animals and plants.
// And keep track of these animals and plants in your notebook.

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.*;

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

        Plant nullPlant = new Plant("Plant");
        nullPlant = null;
        myNotebook.addPlant(nullPlant);

        Flower rose = new Flower("Rose", 0.15);
        rose.setSmell(Scent.SWEET);
        myNotebook.addPlant(rose);

        Flower rose2 = new Flower("Rose", 0.10);
        rose2.setSmell(Scent.MUSKY);
        myNotebook.addPlant(rose2);

        Flower monkeyFlower = new Flower("Musk", 0.30);
        monkeyFlower.setSmell(Scent.MUSKY);
        myNotebook.addPlant(monkeyFlower);

        Flower pineappleWeed = new Flower("Hibiscus Pineapple", 0.40);
        pineappleWeed.setSmell(Scent.PINEAPPLE);
        myNotebook.addPlant(pineappleWeed);

        Bush blueberry = new Bush("blueberry", 0.05);
        blueberry.setFruit("blueberry");
        blueberry.setLeafType(LeafType.HEART);
        myNotebook.addPlant(blueberry);

        Bush rhododendron  = new Bush("Rhododendron", 1);
        rhododendron.setFruit("rhododendron");
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
        herbivoreDiet.add(blueberry);
        herbivoreDiet.add(pineappleWeed);

        // ******** Herbivore ******

        Herbivore elephant = new Herbivore("Elephant", 6300, 4, 5);
        elephant.setPlantDiet(herbivoreDiet);
        elephant.addPlantToDiet(fir);
        //System.out.println("Elephant diet has: " +  elephant.getPlantDiet());
        elephant.printDiet();
        myNotebook.addAnimal(elephant);

        Herbivore elephant1 = new Herbivore("Elephant", 25.0, 6.00, 7.00);
        //elephant1 = null;
        myNotebook.addAnimal(elephant1);

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



        /// Carnivore ****
        Carnivore wolf = new Carnivore("Wolf", 70, 1.50, 1.60);
        wolf.setMaxFoodSize(3);
        System.out.println("wolf's food max size : " + (int) wolf.getMaxFoodSize() + " m");
        myNotebook.addAnimal(wolf);

        Carnivore wolverine = new Carnivore("wolverine", 25, .45, 1.05 );
        wolverine.setMaxFoodSize(25);
        myNotebook.addAnimal(wolverine);


        // Omnivore
        Set<Plant> foxDiet = new HashSet<>();
        Plant berries = new Plant("berries");
        Plant apple = new Plant("apple");
        Plant pears = new Plant("pears");
        foxDiet.add(berries);
        foxDiet.add(apple);
        foxDiet.add(pears);
        Omnivore fox = new Omnivore("Fox", 10, 5, 60);
        fox.setMaxFoodSize(2);
        fox.setPlantDiet(foxDiet);
        System.out.println("******** Fox ******** ");
        myNotebook.addAnimal(fox);
        Set<Plant> plantDiet = fox.getPlantDiet();
        System.out.println("Fox diet contains: ");
        // iterate a set using for each
        for (Plant plant : plantDiet) {
            System.out.printf("%5s", plant);
            System.out.println();
        }
        // iterate using iterator
        Iterator<Plant> plantIterator = plantDiet.iterator();
        System.out.println("Fox diet (with iterator) contains: ");
        while (plantIterator.hasNext()) {
            System.out.println("     " + plantIterator.next());
        }
        // iterate using streams
        System.out.println("Fox diet (streams - for each) contains: ");
        foxDiet.forEach(System.out::println);


        myNotebook.printNoteBook();
        System.out.println("******** Fox ******** ");


        System.out.println("Plant count: " + myNotebook.getPlantCount());
        System.out.println("Animal count: " + myNotebook.getAnimalCount());

        myNotebook.printNoteBook();

        System.out.println("************* Animals sorted by name*********");
        myNotebook.sortAnimalsByName();
        myNotebook.printNoteBook();

        System.out.println("************* Animals sorted by height *********");
        myNotebook.sortAnimalsByHeight();
        myNotebook.printNoteBook();


        System.out.println("************* Carnivores *********************");
        System.out.println("All herbivores (with streams - forEach): ");
        myNotebook.getHerbivores().stream().forEach(System.out::println);

        System.out.println("************* Omnivores *********************");
        System.out.println("All omnivores (with iterator): ");
        Iterator<Omnivore> iterator = myNotebook.getOmnivores().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("************* Herbivores *********************");
        System.out.println("All herbivores(with foreach): ");
        for (Carnivore carnivore : myNotebook.getCarnivores()) {
            System.out.println("    " +  carnivore);
        }


    }
}
