package com.codedifferently.labs.partA.ex03;

public class ShoppingCart {
    public static String shopping(){
        String response = "";
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;


        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        // Test quantity and modify message if quantity > 1.
        if (quantity > 1) {
            message += "s";
        }
        response += message + "\nTotal cost with tax: " + total;

        // Test outOfStock and notify user in either case.
        if (quantity == 0) {
            response = "This item is out of stock";

        }


        return response;
    }



    public static void main(String[] args) {
        String shopOutput = shopping();
        System.out.println(shopOutput);

    }}
