package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào độ dài N");
        int N = Integer.parseInt(input.nextLine());
        int[] arr;
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1));
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Mảng nhập vào");
        System.out.println(Arrays.toString(arr));
        int X = 10;
        int index;
        do {
            System.out.println("Nhập vào vị trí X");
            index = Integer.parseInt(input.nextLine());

            if (index <= -1 || index > arr.length - 1) {
                System.out.println("Không chèn được phần tử vào mảng");
            }
        } while (index <= -1 || index > arr.length - 1);
        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        for (int i = 0; i <arr.length ; i++) {
            arr[index] = X;
        }
        System.out.println(Arrays.toString(arr));
    }
}
