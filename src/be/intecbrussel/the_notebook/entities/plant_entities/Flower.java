package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Flower extends Plant{

    private Scent smell;


    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower: " +
                " smell=" + smell +
                " " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return smell == flower.smell;
    }

    @Override
    public int hashCode() {
        return Objects.hash(smell);
    }
}
