package se.lexicon.data;

import se.lexicon.model.*;

import java.util.Arrays;


public class VendingMachineDataImpl implements VendingMachineData {

    private int moneyPool=0;
    int[] denominations = new int[]{1,2,5,10,20,50,100,200,500,1000};
    private Product[] products = new Product[0];
    /*
    private Fruit[] fruits = new Fruit[0];
    private Food [] foods = new Food[0];
    private Drink [] drinks = new Drink[0];
     */

    // DONE
    @Override
    public void addCurrency(int amount) {

        //write for statement
        // search by amount
        // after finding you can add to monyey pool
                if (amount >= denominations[0] && amount <= denominations[9]) {
         moneyPool += amount;
            System.out.println("Amount added to deposit: " + moneyPool + "kr");
        }
        else {
            System.out.println("Not valid amount");
        }
    }


    // DONE
    @Override
    public Product request(int productNumber) {

        for (Product product : products) {
            if (product.getProductNumber() == productNumber) {
                if (moneyPool >= product.getPrice()) {
                   moneyPool -= product.getPrice();
                }
                return product;
            }
        }
        return null;


    }

    // DONE
    @Override
    public String getDescription(int productNumber) { // 10

        for (Product product : products){ // get the first element 0
             if(product.getProductNumber() == productNumber){ // 1 == 1
                 return "The selected product number is a " +product.examine();
             }
        }

        return "Product does not exists";
    }

    // DONE
    @Override
    public int getBalance() {
        return moneyPool;
    }


    // DONE
    @Override
    public Product[] getProducts() {
        return products;
    }


    // DONE
    @Override
    public int endSession() {
        System.out.println("your change is: " + moneyPool);
        moneyPool = 0;
        return moneyPool;
    }

    // DONE
    @Override
    public Product addProduct(Product product) {
        Product [] newProductArray = Arrays.copyOf(products, products.length +1);
        newProductArray[newProductArray.length -1] = product;
        products = newProductArray;
        return product;

    }



}
