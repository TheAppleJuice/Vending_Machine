package se.lexicon;


import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import se.lexicon.model.Product;
import se.lexicon.data.*;
import se.lexicon.model.*;

import java.time.LocalDate;

public class AppTest 
{
    VendingMachineData vendingMachine = new VendingMachineDataImpl();

    @Before
    public void productImport (){
        Product product1 = new Fruit(1, 10, LocalDate.of(2022,02,20), "Banana", "Yellow");
        Product product2 = new Fruit(2, 10, LocalDate.of(2022,02,20), "Apple", "Green");
        Product product3 = new Fruit(3, 10, LocalDate.of(2022,02,20), "Pear", "Green");

        //Food
        Product product4 = new Food(4, 70, LocalDate.of(2022, 01,01), "Pizza", 4000);
        Product product5 = new Food(5, 65, LocalDate.of(2022, 01,01), "Salad", 2000);
        Product product6 = new Food(6, 50, LocalDate.of(2022, 01,01), "Panini", 3000);

        //Drink
        Product product7 = new Drink(7, 25, LocalDate.of(2022, 01,01), "Water", 33);
        Product product8 = new Drink(8, 25, LocalDate.of(2022, 01,01), "Cola", 33);
        Product product9 = new Drink(9, 30, LocalDate.of(2022, 01,01), "Orange Juice", 55);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);
        vendingMachine.addProduct(product5);
        vendingMachine.addProduct(product6);
        vendingMachine.addProduct(product7);
        vendingMachine.addProduct(product8);
        vendingMachine.addProduct(product9);

    }

    @Test
    public void endSession(){
        vendingMachine.addCurrency(100);
        vendingMachine.request(50);

        int expectedValue = 50;
        vendingMachine.endSession();

        expectedValue = 0;
        int actualValue = vendingMachine.getBalance();
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void balance (){
        vendingMachine.addCurrency(100);

        int expectedValue = 100;
        int actualValue = vendingMachine.getBalance();

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getDescription (){
        String expected = "The selected product number is a Banana and costs 10kr.\n" +
                "It expires:  2022-02-20\n" +
                " The product color is: Yellow";
        String actual= vendingMachine.getDescription(1);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void buyProduct (){
        vendingMachine.addCurrency(100);
        int expected = vendingMachine.request(1);

        Assert.assertEquals(expected,vendingMachine.request(1));
    }

}
