package ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.view;

import ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.controller.BinaryProductController;
import ss17_IO_binary_file_and_serialization.exercise.managing_application_save_as_binary.service.impl.BinaryProductService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BinaryProductController.binaryProductMenu();
    }
}
