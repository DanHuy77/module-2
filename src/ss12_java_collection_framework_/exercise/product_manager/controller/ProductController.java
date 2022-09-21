package ss12_java_collection_framework_.exercise.product_manager.controller;

import ss12_java_collection_framework_.exercise.product_manager.service.IProductService;
import ss12_java_collection_framework_.exercise.product_manager.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static final IProductService iProductService = new ProductService();
    private static final Scanner input = new Scanner(System.in);
    static Integer ID;

    public static void ProductMenu() {
        while (true) {
            System.out.println("---------------WELCOME-----------------");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm theo giá");
            System.out.println("7.Thoát\n");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    System.out.print("Mời nhập ID sản phẩm: ");
                    ID = Integer.parseInt(input.nextLine());
                    iProductService.editProductByID(ID);
                    break;
                case 3:
                    System.out.print("Mời bạn nhập ID sản phẩm cần xóa: ");
                    ID = Integer.parseInt(input.nextLine());
                    iProductService.removeProductByID(ID);
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    System.out.print("Mời nhập tên sản phẩm: ");
                    String name = input.nextLine();
                    iProductService.searchProductByName(name);
                    break;
                case 6:
                    System.out.println("1. Sắp xếp tăng dần");
                    System.out.println("2. Sắp xếp giảm dần");
                    int secondChoice= Integer.parseInt(input.nextLine());
                    if (secondChoice == 1){
                        iProductService.sortIncreaseByPrice();
                    }
                    else if (secondChoice == 2){
                        iProductService.sortDecreaseByPrice();
                    }
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
