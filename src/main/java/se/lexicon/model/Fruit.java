package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public class Fruit extends Product {
    String color;

    public Fruit() {
    }

    public Fruit(String color) {
        this.color = color;
    }

    public Fruit(int productNumber, int price, LocalDate expireDate, String productName, String color) {
        super(productNumber, price, expireDate, productName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(color, fruit.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String examine() {
        return super.examine() + "\n The product color is: " + color;
    }

    @Override
    public String use() {
        return super.use() + " Enjoy!";
    }

    @Override
    public String toString() {
        return "You bought a Fruit for " + getPrice() + "kr";
    }
}
