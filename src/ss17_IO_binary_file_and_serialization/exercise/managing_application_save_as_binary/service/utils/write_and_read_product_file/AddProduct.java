package ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.service.utils.write_and_read_product_file;

import ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.model.BinaryProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.service.impl.BinaryProductService.binaryProductList;

public class AddProduct {

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

        for (int i = 0; i < binaryProductList.size(); i++) {
            bufferedWriter.write(binaryProductList.get(i).toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

}
