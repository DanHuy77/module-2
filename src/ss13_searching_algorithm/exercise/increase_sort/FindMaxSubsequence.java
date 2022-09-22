package ss13_searching_algorithm.exercise.increase_sort;

import java.util.LinkedList;
import java.util.Scanner;


public class FindMaxSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: "); //Welcome
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
//        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();

            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {

                if (string.charAt(j) > list.getLast()) {

                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {

                max.clear();
                max.addAll(list);
            }
            list.clear();
        }


        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
