package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Weed extends Plant{

    private double area;


    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed: " + super.getName() +
                " area= " + area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weed weed = (Weed) o;
        return Double.compare(weed.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }
}
