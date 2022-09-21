package ss12_java_collection_framework_.exercise.product_manager.model;

public class Product {
    private Integer ID;
    private String productName;
    private Integer price;

    public Product() {
    }

    public Product(Integer ID, String productName, Integer price) {
        this.ID = ID;
        this.productName = productName;
        this.price = price;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ID +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}

//    @Override
//    public int compareTo(Product product) {
//        return this.getPrice().compareTo(product.getPrice());
//    }
//}
