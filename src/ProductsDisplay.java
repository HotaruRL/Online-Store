package src;
package com.onlinestore;

import java.util.List;
import java.unil.MAP
import java.util.Scanner;

public class ProductsDisplay {
    private productService productService;
    private cart cart;
    private Scanner scanner;

    public storeUI(productService productService) {
        this.productService = productService;
        this.cart = cart;
        this.scanner = new scanner(System.in);
    }

    public void  showHomeScreen() {
        while (true) {
            System.out.println("\n Welcome to the online store");
            System.out.println("1. Display products");
            System.out.println("2. Display cart");
            System.out.println("3. Exit");
            System.out.println(" Choose an option:");
            switch (choice) {
                case "1":
                    displayProductMenu();
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println(" Thanks for shopping with us!");
                    return;
                default:
                    System.out.println(" Invalid option.");
            }
        }
    }
    private void displayProductMenu(){
        While(true)
        System.out.println("\n Product Menu:");
        System.out.println("1. View All Products");
        System.out.println("2. Search by Name");
        System.out.printf("3. Search by Department");
        System.out.println("4. Search by Price");
        System.out.println("5. Go Back");
        System.out.println("Choose an Option: ");
        String choice = scanner .nextLine();


        List<Product> products = null;

        Switch (choice) {
            case "1":
                products = productService.getAllProducts();
                break;
            case "2":
                System.out.println("Enter product name");
                products = productService.searchByName(scanner.nextLine());
                break;
            case"3":
                System.out.println("Enter department: ");
                products = productService.searchByDepartment(scanner.nextLine());
                break;
            case "4":
                System.out.println(Enter max price: );
                try {
                    double price = Double.parseDouble(scanner.nextLine());
                    Products = productService.searchByPrice(price);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price input. ");

                }
                break;
            case"5":
                return; //

        }

    }
}