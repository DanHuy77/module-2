package ss13_searching_algorithm.exercise.increase_sort_max;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class FindMaxSubsequenceContinually {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        Stack<Character> list = new Stack<>();
        for (int i = 0; i < string.length(); i++) {


            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {

                if (string.charAt(j) > list.peek()) {

                    list.add(string.charAt(j));
                } else break;
            }

            if (list.size() > max.size()) {

                max.clear();
                max.addAll(list);
            }
            list.clear();
        }


        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
