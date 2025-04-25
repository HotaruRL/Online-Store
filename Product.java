class Product {

        String SKU;
        String productName;
        double price;
        String department;

        public Product(String SKU, String productName, double price, String department ){
            this.SKU = SKU;
            this.productName = productName;
            this.price = price;
            this.department = department;

        }
        public String getProductName(){
            return productName;
        }
        public double getPrice(){
            return price;
        }
        public String getDepartment(){
            return department;
        }
    }


