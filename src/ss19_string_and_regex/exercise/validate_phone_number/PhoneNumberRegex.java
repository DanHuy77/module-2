package ss19_string_and_regex.exercise.validate_phone_number;

import java.util.Scanner;

public class PhoneNumberRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phoneNumber;
        while (true) {
            phoneNumber = input.nextLine();
            if (!phoneNumber.matches("[(][0-9)]{2}[)][-][(][0][0-9)]{9}[)]")) {
                System.out.println("Không đúng định dạng, xin nhập lại");
            } else break;
        }
    }
}
