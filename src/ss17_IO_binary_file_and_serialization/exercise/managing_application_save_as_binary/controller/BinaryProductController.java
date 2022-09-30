package ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.controller;

import ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.service.IBinaryProductService;
import ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.service.impl.BinaryProductService;

import java.io.IOException;
import java.util.Scanner;

public class BinaryProductController {
    private static final IBinaryProductService iBinaryProductService = new BinaryProductService();
    private static final Scanner input = new Scanner(System.in);
    static String name;

    public static void binaryProductMenu() throws IOException, ClassNotFoundException {
        while (true) {
            System.out.println("************* WELCOME TO PRODUCT MANAGER *************");
            System.out.println("1. Add new product");
            System.out.println("2. Display all product");
            System.out.println("3. Search product by name");
            System.out.println("4. Exit");
            System.out.println("Please insert your choice: ");

            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    iBinaryProductService.addBinaryProduct();
                    break;

                case 2:
                    iBinaryProductService.displayBinaryProduct();
                    break;

                case 3:
                    System.out.print("Please insert product name: ");
                    name = input.nextLine();
                    iBinaryProductService.searchBinaryProductByName(name);
                    break;
                case 4:
                    System.exit(0);

                default:
                    System.out.println("You had inserted wrong choice");
            }
        }
    }
}
