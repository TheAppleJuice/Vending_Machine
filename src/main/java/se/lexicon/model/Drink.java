package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public class Drink extends Product{
    int volume;

    public Drink() {
    }

    public Drink(int volume) {
        this.volume = volume;
    }

    public Drink(int productNumber, int price, LocalDate expireDate, String productName, int volume) {
        super(productNumber, price, expireDate, productName);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Drink drink = (Drink) o;
        return volume == drink.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volume);
    }
//DONE
    @Override
    public String examine() {
        return super.examine() + " and contains " + volume + "cl";
    }

    @Override
    public String use() {
        return super.use() + "In use";
    }

    @Override
    public String toString() {
        return "Drink{" +
                "volume=" + volume +
                '}';
    }
}
