package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Plant {

    private String name;
    private double height;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // ??? do not override ToString ???


    @Override
    public String toString() {
        return "Plant: " +
                " name= " + name +
                ' ';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.height, height) == 0 && Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }
}
