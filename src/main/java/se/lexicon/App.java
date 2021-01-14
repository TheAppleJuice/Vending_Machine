package se.lexicon;


import se.lexicon.data.VendingMachineData;
import se.lexicon.data.VendingMachineDataImpl;
import se.lexicon.model.Product;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        //Product [0] = "Banana"; Hur lägger jag till produkter till array?
        //Product [] banana = new Product[]; ??


        VendingMachineData vendingMachineData = new VendingMachineDataImpl();
        while (true){
            System.out.println("#######################");
            System.out.println("### Vending machine ###");
            System.out.println(" 1. add money"); //void addCurrency (int amount);
            System.out.println(" 2. show balance"); //int getBalance (int money); //Deposit pool
            //todo: What about String examine() ?
            System.out.println(" 3. list all products"); //Product [] getProducts ();
            System.out.println(" 4. show product description"); //String getDescription (int productNumber);
            System.out.println(" 5. buy a product"); //Product request (int productNumber);
            System.out.println(" 6. end session"); // int endSession(); Return String + balance
            System.out.println(" 7. EXIT");

            Scanner scanner = new Scanner(System.in);
            System.out.println(" enter a valid operation number: ");
            String operationType = scanner.nextLine();

            switch (operationType) {
                case "1":

                    break;
                case "2":


                    break;

                case "3":
                    System.out.println("Product" + vendingMachineData.getProducts());

                    Product[] productResult = vendingMachineData.getProducts();
                    for (Product std : productResult){
                        System.out.println(std.getProductName());
                        System.out.println(std.getPrice());
                    }

                    break;
                case "4":


                    break;

                case "5":


                    break;


                case "6":

                    break;


                case "7":
                    System.exit(0);

                    break;


                default:
                    System.out.println("Operation is not valid");



            }

        }






    }
}