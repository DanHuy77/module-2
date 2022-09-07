package ss3_array_and_method.exercise;

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng lớn");
        int bigSize = Integer.parseInt(input.nextLine());
        System.out.println("Nhập độ dài mảng nhỏ");
        int smallSize = Integer.parseInt(input.nextLine());
        int[][] sumArray;
        sumArray = new int[bigSize][smallSize];
        for (int i = 0; i < bigSize; i++) {
            for (int j = 0; j < smallSize; j++) {
                System.out.println("Nhập phần tử mảng " + (i + 1) + " thứ: " + (j + 1));
                sumArray[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        int index;
        do {
            System.out.println("Nhập vị trí của cột bạn muốn tính tổng, từ 1 và đến " + (smallSize));
            index = Integer.parseInt(input.nextLine());
            if (index > smallSize || index < 0) {
                System.out.println("Nhập vị trí không lớn hơn độ dài mảng!");
            }
        } while (index > smallSize || index < 0);
        int sum = 0;
            for (int i = 0; i < sumArray.length; i++) {
                sum += sumArray[i][index-1];
            }
        System.out.println("Tổng các phần tử tại cột thứ " + index + " là " + sum);
    }

}
