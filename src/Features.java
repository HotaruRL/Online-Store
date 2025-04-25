package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Features {

    // Create an instance of Scanner name in
    Scanner in = new Scanner(System.in);

    // Create a HashMap that acts as an inventory system to hold products
    HashMap<String, Product> inventory= new HashMap<>();
    // Create a ArrayList that acts as a Cart to hold products for checkout
    ArrayList<Product> currentCart = new ArrayList<>();

    // Add a product to cart
    public void addToCart (){
        System.out.println("Please enter the SKU Number to add the product to Cart: ");


        // Get the SKU entered by user
        // Use the SKU as Key to find the product in Hashmap
        Product skuToAdd = inventory.get(in.nextLine());

        // In case cannot find the product with the SKU entered
        if (skuToAdd == null){
            System.out.println("\nProduct not found!\nPlease double check the SKU number and try again");
//        }else {
//        // If found product, ask for the quantity
//            System.out.println("Please enter the quantity: ");
//            int quantityToAdd = in.nextInt();
        }else {
            // If found product, add the found product to currentCart (ArrayList)
            currentCart.add(skuToAdd);
            // Tell the user that the product has been added to cart
            System.out.println(skuToAdd + " has been added to your cart.");
        }



    }
}
