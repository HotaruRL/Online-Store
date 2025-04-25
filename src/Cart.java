public class Cart {
    private Product;
    private int quantity;

    public Cart(Product, int quantity){
        product = product;
        quantity = quantity;
    }
    //Getters
    public Product getProduct() {
    }
    public int getQuantity() {
    }
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

}