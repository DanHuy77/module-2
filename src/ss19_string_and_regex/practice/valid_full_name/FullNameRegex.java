package ss19_string_and_regex.practice.valid_full_name;

import java.util.Scanner;

public class FullNameRegex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullName;
        boolean flag = true;
        while (true) {
            System.out.println("Nhập Họ và Tên");
            fullName = input.nextLine();
            String[] arrName = fullName.split(" ");
            for (String s : arrName) {
                flag = s.matches("[A-ZĐ][a-záàảãạăâắằấầặẵẫậéèẻẽẹếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịđùúủũụưứửữựỷỹ]{2,}");
            }
            if (!flag) {
                System.out.println("Sai định dạng, xin nhập lại");
            } else break;
        }
    }
}
