package ss3_array_and_method.pratice;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Nhập độ dài danh sách");
            size = Integer.parseInt(input.nextLine());
            if (size > 20){
                System.out.println("Nhập độ dài danh sách bé hơn hoặc bằng 20");
            }
        } while (size > 20);
    arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị tài sản của người thứ " + (i+1));
            arr[i] = Integer.parseInt(input.nextLine());
        }
        int index = 0;
        int max = arr[0];
        for (int j = 0; j < arr.length; j++){
            if (arr[j] > max){
                max = arr[j];
                index = j;
            }
        }
        System.out.println("GTLN là: " + max + "tại vị trí: " + (index + 1));
    }
}
