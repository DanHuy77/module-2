package ss11_DSA_stack_queue.exercise.reverse_element_in_integer_array_use_stack.reverse_elements_in_integer_array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int arrLength = Integer.parseInt(input.nextLine());
        Integer[] integersArray = new Integer[arrLength];

        for (int i = 0; i <integersArray.length ; i++) {
            System.out.println("Nhập phần tử mảng " + (i+1));
            integersArray[i] = Integer.parseInt(input.nextLine());
        }

        Stack<Integer> stack = new Stack<>();
        for (Integer integer : integersArray) {
            stack.push(integer);
        }

        for (int i = 0; i <integersArray.length ; i++) {
            integersArray[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo: " + Arrays.toString(integersArray));
    }
}
