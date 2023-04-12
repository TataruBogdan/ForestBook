package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

//TODO Furthermore, there is also the possibility to set other properties[such as Scent or LeafType]
// in the App class via setters[see uml].

public class Bush extends Plant{

    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height){
        super(name, height);
        this.fruit = ""; //
        // LeafType not initialized ok?
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Bush: " +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType;
    }

}
