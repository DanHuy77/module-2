package extra_exercise.member_list.service.impl;

import extra_exercise.member_list.model.Student;
import extra_exercise.member_list.service.IMemberService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IMemberService {
    private static Scanner input = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    public Student inputStudentInformation() {
        System.out.print("Nhập mã học sinh: ");
        String code = input.nextLine();
        System.out.print("Nhập tên học sinh");
        String name = input.nextLine();

        String birthday;
        while (true) {
            try {
                System.out.print("Nhập ngày sinh của học sinh. (Định dạng: dd/mm/yyyy)");
                birthday = input.nextLine();
                if (!birthday.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
                    throw new NullPointerException("Không đúng định đạng, mời nhập lại.");
                }
                break;
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        System.out.print("Nhập giới tính học sinh");
        String gender = input.nextLine();
        if (gender.equals("Nam")){
            gender = "Nam";
        } else if (gender.equals("Nữ")){
            gender = "Nữ";
        } else {
            gender = "Không xác định";
        }

        System.out.print("Nhập tên lớp của học sinh");
        String className = input.nextLine();

        System.out.print("Nhập điểm học sinh");
        double point = Double.parseDouble(input.nextLine());

        Student student = new Student(code,name,birthday,gender,className,point);
    return student;
    }

    @Override
    public void addMember() {

    }

    @Override
    public void removeMember() {

    }

    @Override
    public void displayList() {

    }
}
