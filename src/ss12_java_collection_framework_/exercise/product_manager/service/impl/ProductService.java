package ss12_java_collection_framework_.exercise.product_manager.service.impl;


import ss12_java_collection_framework_.exercise.product_manager.model.Product;
import ss12_java_collection_framework_.exercise.product_manager.service.IProductService;
import ss12_java_collection_framework_.exercise.product_manager.service.utils.ProductComparatorDecrease;
import ss12_java_collection_framework_.exercise.product_manager.service.utils.ProductComparatorIncrease;

import java.util.*;

public class ProductService implements IProductService {
    public static final Scanner input = new Scanner(System.in);
    public static final List<Product> productList = new ArrayList<>();

    public Product InputProductInformation() {
        System.out.print("Nhập ID sản phẩm: ");
        Integer ID = Integer.parseInt(input.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = input.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        Integer price = Integer.parseInt(input.nextLine());

        return new Product(ID, name, price);
    }


    @Override
    public void addProduct() {
        Product product = this.InputProductInformation();
        productList.add(product);
        System.out.println("Thêm mới sản phẩm thành công");
    }

    @Override
    public void displayProduct() {
        if (productList.size() != 0) {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    @Override
    public void removeProductByID(Integer ID) {

        boolean flagDelete = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getID().equals(ID)) {
                System.out.println("Bạn có chắc muốn xóa sản phẩm này không? Nhập Y: yes, N: no");
                String choice = input.nextLine();
                if (choice.equals("Y")) {
                    productList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy sản phẩm cần xóa.");
        }
    }

    @Override
    public void searchProductByName(String name) {

        boolean trackingFlag = false;
        for (Product product : productList) {
            if (product.getProductName().contains(name)) {
                if (!trackingFlag)
                    System.out.println("Những sản phẩm khớp với tìm kiếm: ");

                System.out.println(product.toString());
                trackingFlag = true;
            }
        }
        if (!trackingFlag) {
            System.out.println("Không tìm thấy sản phẩm khớp với mô tả");
        }
    }

    @Override
    public void sortIncreaseByPrice() {
        if (productList.size() != 0) {
            ProductComparatorIncrease productComparatorIncrease = new ProductComparatorIncrease();
            productList.sort(productComparatorIncrease);
            System.out.println("Sắp xếp thành công");
        } else {
            System.out.println("Danh sách không có sản phẩm nào!");
        }
    }

    @Override
    public void sortDecreaseByPrice() {
        if (productList.size() != 0) {
            ProductComparatorDecrease productComparator = new ProductComparatorDecrease();
            productList.sort(productComparator);
            System.out.println("Sắp xếp thành công");
        } else {
            System.out.println("Danh sách không có sản phẩm nào!");
        }
    }

    @Override
    public void editProductByID(Integer ID) {
        boolean flagEdit = false;
        for (Product product : productList) {
            if (product.getID().equals(ID)) {
                System.out.println("Sản phẩm khớp với tìm kiếm");
                System.out.println(product.toString());
                System.out.print("Nhập ID mới: ");
                product.setID(Integer.parseInt(input.nextLine()));
                System.out.print("Nhập tên mới: ");
                product.setProductName(input.nextLine());
                System.out.println("Nhập giá tiền mới");
                product.setPrice(Integer.parseInt(input.nextLine()));
                System.out.println("Sửa thành công");
                flagEdit = true;
                break;
            }
        }
        if (!flagEdit) {
            System.out.println("Không tìm thấy sản phẩm cần sửa.");
        }
    }
}
