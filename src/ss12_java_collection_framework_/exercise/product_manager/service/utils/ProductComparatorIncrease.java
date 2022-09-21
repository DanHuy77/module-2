package ss12_java_collection_framework_.exercise.product_manager.service.utils;

import ss12_java_collection_framework_.exercise.product_manager.model.Product;

import java.util.Comparator;

public class ProductComparatorIncrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else if (o1.getPrice().equals(o2.getPrice())) {
            return o1.getProductName().compareTo(o2.getProductName());
        } else {
            return 1;
        }
    }
}
