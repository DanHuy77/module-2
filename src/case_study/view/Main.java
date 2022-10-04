package case_study.view;

import case_study.controller.FuramaController;
import case_study.utils.exception.CaseStudyFormatException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, CaseStudyFormatException {
        FuramaController.displayMainMenu();
    }
}
