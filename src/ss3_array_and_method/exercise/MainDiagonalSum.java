package ss3_array_and_method.exercise;

import java.util.Scanner;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài hàng");
        int bigSize = Integer.parseInt(input.nextLine());
        System.out.println("Nhập độ dài cột");
        int smallSize = Integer.parseInt(input.nextLine());
        double[][] floatArr;
        floatArr = new double[bigSize][smallSize];
        for (int i = 0; i < bigSize; i++) {
            for (int j = 0; j < smallSize; j++) {
                System.out.println("Nhập phần tử tại hàng " + (i + 1) + " cột " + (j + 1));
                floatArr[i][j] = Double.parseDouble(input.nextLine());
            }
        }
        double sum = 0.0;
        for (int i = 0; i < floatArr.length; i++) {
            sum += floatArr[i][i];
        }

        double sum1 = 0.0;
        for (int i = 0; i < floatArr.length; i++) {
            sum1 += floatArr[i][floatArr.length - 1 - i];
        }

        System.out.println("Tổng của các phần tử ở đường chéo chính: " + sum);
        System.out.println("Tổng đường chéo phụ: " + sum1);
    }
}