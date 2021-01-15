package se.lexicon;


import se.lexicon.data.VendingMachineData;
import se.lexicon.data.VendingMachineDataImpl;
import se.lexicon.model.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        VendingMachineData vendingMachine = new VendingMachineDataImpl();

        //Typecasting...
        //Fruit
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



        while (true){
            System.out.println("#######################");
            System.out.println("### Vending machine ###");
            System.out.println(" 1. Add money"); //void addCurrency (int amount);
            System.out.println(" 2. Show balance"); //int getBalance (int money); //Deposit pool
            //todo: What about String examine() ?
            System.out.println(" 3. List all products"); //Product [] getProducts ();
            System.out.println(" 4. Show product description"); //String getDescription (int productNumber);
            System.out.println(" 5. Buy a product"); //Product request (int productNumber);
            System.out.println(" 6. End session - return change"); // int endSession(); Return String + balance
            System.out.println(" 7. EXIT");
            System.out.println("#######################");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a valid operation number:");
            String operationType = scanner.nextLine();

            switch (operationType) {
                //DONE
                case "1": // add money
                    System.out.println("---------------------------------\n");
                    System.out.println("Enter amount to money pool: ");
                    int amount = scanner.nextInt();
                    vendingMachine.addCurrency(amount);
                    System.out.println("---------------------------------\n");
                    break;

                //DONE
                case "2": //Show balance
                    System.out.println("---------------------------------\n");
                    System.out.println("Your balance is: " + vendingMachine.getBalance() + "kr");
                    System.out.println("---------------------------------\n");
                    break;

                //DONE
                case "3": // List all products
                    Product[] result = vendingMachine.getProducts();
                    for (Product std : result) {
                        System.out.println("---------------------------------\n");
                        System.out.println("Product number: " + std.getProductNumber());
                        System.out.println("Product costs: " + std.getPrice() + "kr");
                        System.out.println("Product name : " + std.getProductName());
                        System.out.println("---------------------------------\n");
                    }
                    break;

                // DONE
                case "4": //Show product description
                    System.out.println("---------------------------------\n");
                    System.out.println("What product do you want to examine?: ");
                    int productNumber = scanner.nextInt();
                    System.out.println(vendingMachine.getDescription(productNumber));
                    System.out.println("---------------------------------\n");

                    break;
                // DONE
                case "5": // Buy a product
                    // after buying : product.examine
                    System.out.println("---------------------------------\n");
                    System.out.println("What product do you want to buy?: ");
                    int buyProduct = scanner.nextInt();
                    System.out.println(vendingMachine.request(buyProduct));
                    System.out.println("---------------------------------\n");

                    break;

                //DONE
                case "6": // End session
                    vendingMachine.endSession();
                    break;

                //DONE
                case "7":
                    System.exit(0);

                    break;


                default:
                    System.out.println("---------------------------------\n");
                    System.out.println("Operation is not valid");
                    System.out.println("---------------------------------\n");
            }
        }
    }
}