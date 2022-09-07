package ss3_array_and_method.exercise;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int size =  Integer.parseInt(input.nextLine());
        int[]arr;
        arr = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Nhập phần tử " + (i+1) + " của mảng");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("GTNN: " + min);
    }
}
