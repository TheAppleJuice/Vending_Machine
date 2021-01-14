package se.lexicon.model;

import java.util.Objects;

public abstract class Product {
    //Fields for product state
    private int price;
    // private String productType;
    private String productName;


    //Constructor
    public Product() {
    }

    public Product(int price, String productName) {
        this.price = price;
        this.productName = productName;
    }
    //Common functionality
    public String examine() {
        return "The " + productName + " price is " + price ;
    }
    //Common functionality
    public String use(){
        return "The " + productName + " is in use";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, productName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}

