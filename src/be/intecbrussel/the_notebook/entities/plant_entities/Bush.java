package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Bush extends Plant{

    private String fruit;
    private LeafType leafType;

    public Bush(String fruit) {
        super(fruit);
    }

    public Bush(String fruit, double height){
        super(fruit, height);
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
        return "Bush{" +
                "fruit='" + fruit + '\'' +
                ", leafType=" + leafType +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bush bush = (Bush) o;
        return Objects.equals(fruit, bush.fruit) && leafType == bush.leafType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruit, leafType);
    }
}
