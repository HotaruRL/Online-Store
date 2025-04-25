import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineStore {

    List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        store.loadInitialProducts();
        store.run();

    }

    public void loadInitialProducts() {
        Product product1 = new Product("AV1051", "JBL Bluetooth Speaker", 89.95, "Audio Video");
        Product product2 = new Product("AV1312", "Mini 1000 Lumens Projector", 149.95, "Audio Video");
        Product product3 = new Product("GM1148", "Retro Handheld Arcade", 24.45, "Games");
        Product product4 = new Product("PW1001", "Solar Powered Battery Charger", 19.99, "Electronics");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

    }
    public void displayProducts() {
        while (true) { // Loop to keep showing products/options
            System.out.println("\n--- Product List ---");
            if (products.isEmpty()) {
                System.out.println("No products to display.");
                return; // Exit the method if there are no products
            }

            for (int i = 0; i < products.size(); i++) {
                Product product = products.get(i);
                System.out.println((i + 1) + ". " + product.getProductName() + " - $" + product.getPrice() + " (" + product.department + ")");
            }

            System.out.println("\nOptions:");
            System.out.println("1. Search Products");
            System.out.println("2. Go Back to Home");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                searchProducts(); // Go to search functionality
            } else if (choice == 2) {
                break; // Go back to the main menu
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
    public void searchProducts() {
        System.out.println("\n--- Search Products ---");
        System.out.println("Search by:");
        System.out.println("1. Name");
        System.out.println("2. Price");
        System.out.println("3. Department");
        System.out.print("Enter your choice: ");

        int searchChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (searchChoice == 1) {
            searchByName();
        } else if (searchChoice == 2) {
            searchByPrice();
        } else if (searchChoice == 3) {
            searchByDepartment();
        } else {
            System.out.println("Invalid search choice.");
        }
    }
    public void searchByName() {
        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine().toLowerCase(); // Get search term (case-insensitive)

        System.out.println("\n--- Search Results (Name) ---");
        boolean found = false; // Flag to track if any matches were found
        for (Product product : products) {
            if (product.getProductName().toLowerCase().contains(searchName)) { // Check if name contains search term
                System.out.println(product.getProductName() + " - $" + product.getPrice() + " (" + product.getDepartment() + ")");
                found = true; // Set flag to true because we found a match
            }
        }
        if (!found) { // If no matches were found
            System.out.println("No products found matching '" + searchName + "'");
        }
    }
    public void searchByPrice() {
        System.out.print("Enter maximum price: $");
        double maxPrice = scanner.nextDouble(); // Get maximum price
        scanner.nextLine();                     // Consume newline

        System.out.println("\n--- Search Results (Price) ---");
        boolean found = false;
        for (Product product : products) {
            if (product.getPrice() <= maxPrice) { // Check if price is less than or equal to maxPrice
                System.out.println(product.getProductName() + " - $" + product.getPrice() + " (" + product.getDepartment() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found under $" + maxPrice);
        }
    }
    public void searchByDepartment() {
        System.out.print("Enter department to search: ");
        String searchDepartment = scanner.nextLine().toLowerCase(); // Get department (case-insensitive)

        System.out.println("\n--- Search Results (Department) ---");
        boolean found = false;
        for (Product product : products) {
            if (product.getDepartment().toLowerCase().equals(searchDepartment)) { // Check if department matches
                System.out.println(product.getProductName() + " - $" + product.getPrice() + " (" + product.getDepartment() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found in " + searchDepartment);
        }
    }
    public void run() {
        while (true) { // Main loop of the application
            System.out.println("\n--- Online Store ---");
            System.out.println("1. Display Products");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                displayProducts(); // Show products and search options
            } else if (choice == 2) {
                System.out.println("Exiting...");
                break; // Exit the loop and the application
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
        }




