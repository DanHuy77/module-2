package ss3_array_and_method.exercise;

import java.util.Scanner;

public class MaxInTwoWaysArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng lớn");
        int bigSize = Integer.parseInt(input.nextLine());
        System.out.println("Nhập độ dài mảng nhỏ");
        int smallSize = Integer.parseInt(input.nextLine());
        int[][] twoWaysArr;
        twoWaysArr = new int[bigSize][smallSize];
        for (int i = 0; i < bigSize; i++) {
            for (int j = 0; j < smallSize; j++) {
                System.out.println("Nhập các phần tử mảng " + (i+1) + " thứ " + (j+1));
                twoWaysArr[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        int max = twoWaysArr[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < twoWaysArr.length; i++) {
            for (int j = 0; j < twoWaysArr[i].length; j++) {
                if (twoWaysArr[i][j] > max) {
                    max = twoWaysArr[i][j];
                    index1 = i;
                    index2 = j;
                    System.out.println("GTLN vừa tìm thấy: " + max);
                }
            }
        }
        System.out.println("GTLN của mảng 2 chiều: " + max + " tại vị trí: " + index1 + "," + index2);
    }
}
