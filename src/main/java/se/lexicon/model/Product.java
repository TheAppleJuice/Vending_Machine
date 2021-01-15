package se.lexicon.model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Product {
    //Fields for product state
    private int productNumber;
    private int price;
    private LocalDate expireDate;
    private String productName;
    // todo: Kolla rad 13 om den ska vara med?!
    //private Denominations denominations;


    //Constructor
    public Product() {
    }

    public Product(int productNumber, int price, LocalDate expireDate, String productName) {
        this.productNumber = productNumber;
        this.price = price;
        this.expireDate = expireDate;
        this.productName = productName;
    }

    //Common functionality
    public String examine() {
        return productName + " and costs " + price + "kr." + " It expires: " + expireDate ;
    }
    //Common functionality
    public String use(){
        return "The " + productName + " is in use";
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
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
        return productNumber == product.productNumber && price == product.price && Objects.equals(expireDate, product.expireDate) && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productNumber, price, expireDate, productName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", price=" + price +
                ", expireDate=" + expireDate +
                ", productName='" + productName + '\'' +
                '}';
    }
}

