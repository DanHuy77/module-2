package extra_exercise.member_list.service.impl;

import extra_exercise.member_list.model.Teacher;
import extra_exercise.member_list.service.IMemberService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IMemberService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Teacher> teacherList = new ArrayList<>();

    public Teacher inputTeacherInformation() {
        System.out.print("Nhập mã giáo viên: ");
        String code = input.nextLine();
        System.out.print("Nhập tên giáo viên");
        String name = input.nextLine();

        String birthday;
        do {
            System.out.print("Nhập ngày sinh của giáo viên. (Định dạng: dd/mm/yyyy): ");
            birthday = input.nextLine();
            if (!birthday.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
                System.out.println(("Không đúng định đạng, mời nhập lại."));
            }
        } while (!birthday.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"));
        System.out.print("Nhập giới tính học sinh");
        String gender = input.nextLine();
        if (gender.equals("Nam")) {
            gender = "Nam";
        } else if (gender.equals("Nữ")) {
            gender = "Nữ";
        } else {
            gender = "Undefined. ";
        }
        System.out.print("Nhập chuyên môn giáo viên: ");
        String specialization = input.nextLine();

        return new Teacher(code, name, birthday, gender, specialization);
    }

    @Override
    public void addMember() {
        Teacher teacher = this.inputTeacherInformation();

        teacherList.add(teacher);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeMember() {
        System.out.print("Mời bạn nhập mã giáo viên cần xóa: ");
        String code = input.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = input.nextLine();
                if (choice.equals("Y")) {
                    teacherList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    }


    @Override
    public void displayList() {
        if (teacherList.size() != 0) {
            for (Teacher teacher : teacherList) {
                System.out.println(teacher);
            }

        } else {
            System.out.println("Danh sách hiện tại không có thành viên nào.");
        }
    }
}
