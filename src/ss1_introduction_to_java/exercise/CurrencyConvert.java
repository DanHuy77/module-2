package ss1_introduction_to_java.exercise;


import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        double vnd = 23000 ;
        double usd;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        usd = input.nextDouble();
        double rate = usd * vnd;
        System.out.println("Số tiền sau khi đổi " + rate);
    }
}
