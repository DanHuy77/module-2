package ss11_DSA_stack_queue.exercise.convert_decimal_number_to_binary_number;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Decimal number: ");
        Stack<Integer> stack = new Stack<>();
        int decimalNumber = Integer.parseInt(input.nextLine());
        while (decimalNumber > 0){
            stack.push(decimalNumber%2);
            decimalNumber = decimalNumber /2;
        }
        System.out.println("Binary number is: ");
        for (int i = 0; i < stack.size() + i; i++) {
            System.out.print(stack.pop());
        }
    }
}
