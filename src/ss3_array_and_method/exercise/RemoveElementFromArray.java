package ss3_array_and_method.exercise;


import java.util.Arrays;

public class RemoveElementFromArray {
    public static int[] removeElement(int element, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int element = 7;
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        removeElement(element, arr);
        System.out.println(Arrays.toString(arr));
    }
}
