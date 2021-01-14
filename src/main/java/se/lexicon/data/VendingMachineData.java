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

    void addCurrency (int amount); //System.in, add amount to (int money) Array+1?
    Product request (int productNumber); //buy product!
    //todo: Check author example.
    String getDescription (int productNumber); // single product description. String + productNumber (kolla författare + bok)
    int getBalance (int money); //Deposit pool. Return String + (int money)
    Product [] getProducts (); // List all products
    int endSession(); //Return change from (int money) Return String + balance


}




