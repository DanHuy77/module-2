package ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.service;

import java.io.IOException;

public interface IBinaryProductService {
    void addBinaryProduct() throws IOException, ClassNotFoundException;
    void displayBinaryProduct() throws IOException, ClassNotFoundException;
    void searchBinaryProductByName(String name);

}
