package ss12_java_collection_framework_.exercise.product_manager.service;

public interface IProductService {
    void addProduct();
    void displayProduct();
    void removeProductByID(Integer ID);
    void searchProductByName(String name);
    void sortIncreaseByPrice();
    void sortDecreaseByPrice();
    void editProductByID(Integer ID);
}
