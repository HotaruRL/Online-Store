import java.util.ArrayList;
import java.util.list;

public class Cart{
    private List<Cart> items = new ArrayList<>();

    public void addProduct(Product, int quantity){
        for (Cart item : items){
            if (item.getProduct().getSku().equals(product.getSku)){
                //increase quantity if product is already in cart
                item = new Cart(product, item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new Cart(product, quantity));
    }
    public void removeProduct(String sku) {
        items.removeIf(item -> item.getProduct().getSku().equalsIgnoreCase(sku));
    }
    public void displayCart(){
        double total = 0.0;
        System.out.println("Your Cart:");
        for (Cart item : items) {
            System.out.println(item.getProduct().getName() + " - Quantity: " +item.getQuantity() + " - Subtotal: $" + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("total: $" = total);
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
}