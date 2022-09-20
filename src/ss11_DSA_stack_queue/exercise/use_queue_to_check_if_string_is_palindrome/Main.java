package ss11_DSA_stack_queue.exercise.use_queue_to_check_if_string_is_palindrome;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        String[] arrString = string.toLowerCase().split("");
        Stack<String> stackString = new Stack<>();
        Queue<String> queueString = new LinkedList<>();
        for (String s : arrString) {
            stackString.push(s);
            queueString.add(s);
        }
        int size = queueString.size();
        for (int i = 0; i < size; i++) {
            if (stackString.peek().equals(queueString.element())) {
                queueString.remove();
                stackString.pop();
            }
        }
        if (queueString.size() == 0) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("is not!");
        }
    }
}
