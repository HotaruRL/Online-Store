class Product {

        private String SKU;
        private String productName;
        private double price;
        private String department;

        Product(String SKU, String productName, double price, String department ){
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


