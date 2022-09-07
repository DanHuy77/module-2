package ss3_array_and_method.pratice;

import java.util.Scanner;

public class ExamPassedStudentsOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Nhập số lượng học sinh");
            number = Integer.parseInt(input.nextLine());
            if (number > 30) {
                System.out.println("Số lượng học sinh không được lớn hơn 30");
            }
        } while (number > 30);
        int[] studentArr;
        studentArr = new int[number];
        int count = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập điểm học sinh thứ " + (i + 1));
            studentArr[i] = Integer.parseInt(input.nextLine());
            if (studentArr[i] >= 5 && studentArr[i] <= 10){
                count++;
            }
        }
        System.out.println("Số lượng học sinh thi đỗ: " + count);
    }
}
