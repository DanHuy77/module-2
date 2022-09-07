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
        int element = 1;
        int[] arr = {1, 2, 1, 1, 1, 1};
        removeElement(element, arr);
        System.out.println(Arrays.toString(arr));
    }
}
