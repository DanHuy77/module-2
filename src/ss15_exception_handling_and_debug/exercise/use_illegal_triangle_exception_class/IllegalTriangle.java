package ss15_exception_handling_and_debug.exercise.use_illegal_triangle_exception_class;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập cạnh a: ");
                int sideA = Integer.parseInt(input.nextLine());
                System.out.print("Nhập cạnh b: ");
                int sideB = Integer.parseInt(input.nextLine());
                System.out.print("Nhập cạnh c: ");
                int sideC = Integer.parseInt(input.nextLine());

                try {
                    triangleCheck(sideA, sideB, sideC);
                    break;
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                }

            } catch (NumberFormatException e) {
                System.out.println("Nhập sai kiểu dữ liệu");
            }
        }
    }

    private static void triangleCheck(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Độ dài không hợp lệ");
        } else {
            System.out.println("Là 1 tam giác");
        }
    }
}