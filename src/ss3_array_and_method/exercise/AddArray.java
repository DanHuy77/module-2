package ss3_array_and_method.exercise;

import javax.swing.*;
import java.util.Arrays;

public class AddArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10, 11, 12};
        int size = array1.length + array2.length;

        int[] array3;
        array3 = new int[size];
        for (int i = 0; i < array1.length ; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j <array2.length ; j++) {
            array3[j +array1.length] = array2[j];
        }
        System.out.println(Arrays.toString(array3));
    }
}
