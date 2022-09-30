package ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.service.impl;

import ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.model.BinaryProduct;
import ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.service.IBinaryProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryProductService implements IBinaryProductService {
    private static final Scanner input = new Scanner(System.in);
    public static List<BinaryProduct> binaryProductList = new ArrayList<>();

    public BinaryProduct binaryProductInputInformation() {
        System.out.println("Insert product code");
        String productCode = input.nextLine();
        System.out.println("Insert product name");
        String productName = input.nextLine();
        System.out.println("Insert producer");
        String producer = input.nextLine();
        System.out.println("Insert product price");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Insert other Description");
        String otherDescription = input.nextLine();
        return new BinaryProduct(productCode, productName, producer, price, otherDescription);
    }

    @Override
    public void addBinaryProduct() throws IOException, ClassNotFoundException {
        binaryProductList = getAllProductFromFile();

        BinaryProduct binaryProduct = this.binaryProductInputInformation();

        binaryProductList.add(binaryProduct);

        writeProductFile(binaryProductList);

        writeObjectFile(binaryProductList);

        readObjectFile(binaryProductList);

        writeObjectFile2(binaryProductList);

        System.out.println("Added new product");
    }

    @Override
    public void displayBinaryProduct() throws IOException, ClassNotFoundException {
        writeObjectFile2(binaryProductList);

        binaryProductList = getAllProductFromFile();
        if (binaryProductList.size() == 0) {
            System.out.println("There is no product in list!");
        } else {
            for (BinaryProduct binaryProduct : binaryProductList) {
                System.out.println(binaryProduct);
            }
        }
    }

    @Override
    public void searchBinaryProductByName(String name) {
        boolean flagSearch = false;
        for (int i = 0; i < binaryProductList.size(); i++) {
            if (binaryProductList.get(i).getProductName().contains(name)) {
                System.out.println("Found product: " + binaryProductList.get(i));
                flagSearch = true;
            }
        }
        if (!flagSearch) {
            System.out.println("Product not found!");
        }
    }

    private List<BinaryProduct> getAllProductFromFile() throws IOException {

        File file = new File("src\\ss17_IO_binary_file_and_serialization\\exercise\\managing_application_save_as_binary\\read_and_write_to_binary_data\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        List<BinaryProduct> binaryProductList = new ArrayList<>();
        String[] info;
        BinaryProduct binaryProduct;
        while ((line = bufferedReader.readLine()) != null) {
            info = line.split(",");
            binaryProduct = new BinaryProduct(info[0], info[1], info[2], Integer.parseInt(info[3]), info[4]);
            binaryProductList.add(binaryProduct);
        }
        bufferedReader.close();
        return binaryProductList;
    }


    private void writeProductFile(List<BinaryProduct> binaryProductList) throws IOException {
        File file = new File("src\\ss17_IO_binary_file_and_serialization\\exercise\\managing_application_save_as_binary\\read_and_write_to_binary_data\\input.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (BinaryProduct binaryProduct : binaryProductList) {
            bufferedWriter.write(binaryProduct.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private void writeObjectFile(List<BinaryProduct> binaryProductList) throws IOException, ClassNotFoundException {
        File outputSource = new File("src\\ss17_IO_binary_file_and_serialization\\exercise\\managing_application_save_as_binary\\read_and_write_to_binary_data\\output.dat");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(outputSource));
        for (BinaryProduct binaryProduct : binaryProductList) {
            objectOutputStream.writeObject(binaryProduct.toString());
        }
        objectOutputStream.close();

    }

    private void readObjectFile(List<BinaryProduct> binaryProductList) throws IOException, ClassNotFoundException {
        File inputSource = new File("src\\ss17_IO_binary_file_and_serialization\\exercise\\managing_application_save_as_binary\\read_and_write_to_binary_data\\output.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(inputSource));
        objectInputStream.readObject();
        objectInputStream.close();
    }

    private void writeObjectFile2(List<BinaryProduct> binaryProductList) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src\\ss17_IO_binary_file_and_serialization\\exercise\\managing_application_save_as_binary\\read_and_write_to_binary_data\\output.dat"));
        objectOutputStream.writeObject(binaryProductList);
        objectOutputStream.close();
    }

}
