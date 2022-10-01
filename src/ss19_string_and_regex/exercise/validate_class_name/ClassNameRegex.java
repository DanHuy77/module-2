package ss19_string_and_regex.exercise.validate_class_name;

import java.util.Scanner;

public class ClassNameRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String className;
        while (true) {
            className = input.nextLine();
            if (!className.matches("^[CAP][0-9]{4}[GHIKLM]$")) {
                System.out.println("Sai định dạng, nhập lại");
            } else break;
        }
    }
}
