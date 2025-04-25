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
        while (true) {
            System.out.println("\n--- Product List ---");
            if (products.isEmpty()) {
                System.out.println("No products to display");
                return;

            }
        }
    }
}


