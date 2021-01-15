package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public class Food extends Product{
    int calories;

    public Food() {
    }

    public Food(int calories) {
        this.calories = calories;
    }

    public Food(int productNumber, int price, LocalDate expireDate, String productName, int calories) {
        super(productNumber, price, expireDate, productName);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Food food = (Food) o;
        return calories == food.calories;
    }

    // override examine method

    @Override
    public String examine() {
        return super.examine() + " and has " + calories + " calories";
    }

    @Override
    public String use() {
        return super.use();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), calories);
    }

    @Override
    public String toString() {
        return "Food{" +
                "calories=" + calories +
                '}';
    }
}
