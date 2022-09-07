package ss3_array_and_method.pratice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementReverse {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Nhập độ dài mảng");
            size = Integer.parseInt(input.nextLine());
            if (size > 20) {
                System.out.println("Nhập độ dài tối đa là 20!");
            }
        } while (size > 20);
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử " + (i + 1));
            array[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Mảng vừa nhập:");
        System.out.println(Arrays.toString(array));

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("Mảng đảo ngược:");
        System.out.println(Arrays.toString(array));
    }
}
