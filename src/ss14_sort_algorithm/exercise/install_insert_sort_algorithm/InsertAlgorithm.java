package ss14_sort_algorithm.exercise.install_insert_sort_algorithm;

import java.util.Arrays;

public class InsertAlgorithm {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 4, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
