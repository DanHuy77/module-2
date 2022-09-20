package ss11_DSA_stack_queue.exercise.reverse_element_in_integer_array_use_stack.reverse_elements_in_string_array;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        String mWord = "Hello";
        String output = "Huy";
        String[] stringArr = mWord.split("");

        for (String s : stringArr) {
            wStack.push(s);
        }
        System.out.println(wStack);

            mWord += wStack.pop();
            mWord += wStack.pop();
            mWord += wStack.pop();
            mWord += wStack.pop();
            mWord += wStack.pop();


        output+= mWord;
        System.out.println(output);
    }
}
