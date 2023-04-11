package be.intecbrussel.the_notebook.entities.plant_entities;

import java.util.Objects;

public class Tree extends Plant{

    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree: " + super.getName() +
                " leafType= " + leafType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return leafType == tree.leafType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leafType);
    }
}
