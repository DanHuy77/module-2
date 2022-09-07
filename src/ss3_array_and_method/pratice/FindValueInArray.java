package ss3_array_and_method.pratice;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students =  {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner input = new Scanner(System.in);

        boolean isExist = false;
        System.out.println("Nhập tên sinh viên");
        String name = input.nextLine();

        for (int i = 0; i < students.length; i++){
            if (students[i].equals(name)){
                System.out.println("Vị trí của sinh viên trong danh sách: " + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không tìm thấy sinh viên " + name);
        }
    }


}
