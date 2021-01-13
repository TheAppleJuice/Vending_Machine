package se.lexicon.data;

//todo: An interface VendingMachine should be created that defines the following methods:
//o void addCurrency (int amount) - Add to the deposit pool (moneyPool).
//o Product request (int productNumber) - Buy a Product.
//o int endSession () Returns change and resets the deposit pool.
//o String getDescription (int productNumber) - View a product description.
//o int getBalance () - Returns the deposit pool amount.
//o String [] getProducts () - Returns all Products' names and product numbers.


import se.lexicon.model.Product;

public interface VendingMachineData {

    Product addProduct(Product product);

    void addCurrency (int amount);
    Product request (int productNumber);
    String getDescription (int productNumber);
    int getBalance (int money); //Deposit pool
    Product [] getProducts (); //Buy product
    int endSession();


}




