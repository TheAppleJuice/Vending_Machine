package se.lexicon;


import se.lexicon.data.VendingMachineData;
import se.lexicon.data.VendingMachineDataImpl;
import se.lexicon.model.Product;
import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        //Product [0] = "Banana"; Hur lägger jag till produkter till array?

        VendingMachineData vendingMachineData = new VendingMachineDataImpl();
        while (true){
            System.out.println("#######################");
            System.out.println("### Vending machine ###");
            System.out.println(" 1. add money");
            System.out.println(" 2. show balance");
            System.out.println(" 3. list all products");
            System.out.println(" 4. show product description");
            System.out.println(" 5. buy a product");
            System.out.println(" 6. end session");
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