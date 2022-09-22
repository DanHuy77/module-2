package ss13_searching_algorithm.exercise.install_binary_searching_algorithm_use_recursion;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng");
        int arrLength = Integer.parseInt(input.nextLine());
        int[] integersArray = new int[arrLength];
        for (int i = 0; i <arrLength ; i++) {
            System.out.println("Nhập phần tử thứ: " + (i+1));
            integersArray[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Nhập phần tử cần tìm");
        int element = Integer.parseInt(input.nextLine());
        Arrays.sort(integersArray);
        System.out.println("Vị trí của phần tử cần tìm: " + binarySearch(integersArray, 0, integersArray.length - 1, element));

    }

    public static int binarySearch(int[] array, int left, int right, int value) {

        if (right >= left) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            }
            if (array[middle] > value) {
                return binarySearch(array, left, middle-1, value);
            }
            if (array[middle] < value) {
                return binarySearch(array, middle+1, right, value);
            }
        }
        return -1;
    }
}
