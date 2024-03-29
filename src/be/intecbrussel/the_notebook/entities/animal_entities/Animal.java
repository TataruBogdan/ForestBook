package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.Objects;

public class Animal {

    protected String name;
    protected double weight;
    protected double height;
    protected double length;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // no toString ??
//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", weight=" + weight +
//                ", height=" + height +
//                ", length=" + length +
//                '}';
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // equals compare from String class ?
        String objName = ((Animal) o).getName();
        return this.getName().equals(objName);
//        Animal animal = (Animal) o;
//        return Objects.equals(name, animal.name);
    }

    @Override

    public int hashCode() {
        return this.name.hashCode() + 57;
        // return Objects.hash(name, weight, height, length);
    }
}
