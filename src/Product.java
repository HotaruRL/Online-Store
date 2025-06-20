package src;
public class Product {

    // Fields (Properties)
    private int sku;
    private String productName;
    private double price;
    private String department;

    // Constructor
    Product(int sku, String productName,double price,String department){
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

    // Getters
    public int getSku() {
        return sku;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public String getDepartment() {
        return department;
    }

    // Setters
    public void setSku(int sku) {
        this.sku = sku;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
