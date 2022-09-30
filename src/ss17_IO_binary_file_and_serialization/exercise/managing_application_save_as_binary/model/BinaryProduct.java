package ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.model;

import java.io.Serializable;

public class BinaryProduct implements Serializable {
    private String productCode;
    private String productName;
    private String producer;
    private int price;
    private String otherDescription;

    public BinaryProduct() {
    }

    public BinaryProduct(String productCode, String productName, String producer, int price, String otherDescription) {
        this.productCode = productCode;
        this.productName = productName;
        this.producer = producer;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return productCode+","+productName+","+ producer +
                "," + price + "," + otherDescription;
    }
}
