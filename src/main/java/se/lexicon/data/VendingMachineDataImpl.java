package se.lexicon.data;

import se.lexicon.model.*;

import java.util.Arrays;
import java.util.Scanner;


public class VendingMachineDataImpl implements VendingMachineData {

    private int moneyPool=0;


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

    //todo: How to add currency? System.in, add amount to (int money) Array+1?
    public void addCurrency(int amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter amount to moneypool: ");
        int addCurrency = scanner.nextInt();
        // kolla så det inte är noll
        addCurrency = moneyPool;
    }

    @Override
    // todo: buy product!
    public Product request(int productNumber) {
        return null;
    }

    @Override
    //todo: single product description. String + productNumber
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    // todo: Deposit pool. Return String + (int money) Använd modulus.
    public int getBalance(int money) {
        return 0;
    }

    @Override
    // todo: List all products
    public Product[] getProducts() {
        return products;
    }

    @Override
    //todo: Return change from (int money) Return String + balance. Modulus?! Kolla udemy om seconds + hours.
    public int endSession() {
        System.out.println("your change is: " + moneyPool);
        moneyPool = 0;
        return moneyPool;
    }

}
