package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;

                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int k = 1; k < i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 5; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }

                    System.out.print("\n");

                    for (int i = 1; i <= 5; i++) {
                        for (int k = 5; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }

                    System.out.print("\n");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }

                    System.out.print("\n");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;

                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int k = 4; k >= i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
            }
        }
    }
}