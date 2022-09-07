package ss3_array_and_method.exercise;

import java.util.Scanner;

public class TimesOfCharAppearsInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi");
        String str = input.nextLine();
        System.out.println("Nhập ký tự");
        char ch = input.next().charAt(0);
        String ch1 = Character.toString(ch);
        String[] arrStr = str.split("");
        int count = 0;
        for (int i = 0; i <arrStr.length ; i++) {
            if (arrStr[i].equals(ch1)){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự trong chuỗi: " + count);
    }
}
