package se.lexicon.data;

import se.lexicon.model.*;

import java.util.Arrays;


public class VendingMachineDataImpl implements VendingMachineData {

    private int moneyPool;

    private Product[] products; // build array of products
    public VendingMachineDataImpl(){
        products = new Product[0];
    }

    @Override
    public Product addProduct(Product product) {
        Product [] newProductArray = Arrays.copyOf(products, products.length +1);
        newProductArray[newProductArray.length -1] = product;
        products = newProductArray;
        return product;

    }
    @Override

    //todo: How to add currency
    public void addCurrency(int amount) {

    }

    @Override

    public Product request(int productNumber) {
        return null;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance(int money) {
        return 0;
    }

    @Override
    public Product[] getProducts() {
        return products;
    }

    @Override
    public int endSession() {
        System.out.println("your change is: " + moneyPool);
        moneyPool = 0;
        return moneyPool;
    }

}
