package extra_exercise.member_list.service.impl;

import extra_exercise.member_list.model.Teacher;
import extra_exercise.member_list.service.IMemberService;
import extra_exercise.member_list.service.utils.IllegalFullNameException;
import extra_exercise.member_list.service.utils.IllegalGenderException;
import extra_exercise.member_list.service.utils.IllegalInputException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements IMemberService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Teacher> teacherList = new ArrayList<>();

    public Teacher inputTeacherInformation() {
        String code;
        while (true) {

            try {
                System.out.print("Nhập mã giáo viên: ");
                code = input.nextLine();
                IllegalInputException.validInputCheck(code);
                break;
            } catch (IllegalInputException e) {
                System.out.println(e.getMessage());
                ;
            }
        }

        String name;
        while (true) {

            try {
                System.out.print("Nhập tên giáo viên: ");
                name = input.nextLine();
                IllegalFullNameException.nameCheck(name);
                break;
            } catch (IllegalFullNameException e) {
                System.out.println(e.getMessage());
                ;
            }
        }


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday;
        while (true) {
            try {
                System.out.print("Nhập ngày sinh giáo viên (định dạng dd/MM/yyyy) :");
                birthday = LocalDate.parse(input.nextLine(), formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Không đúng định dạng, xin nhập lại");
            }
        }

        String gender;
        while (true) {

            try {
                System.out.print("Nhập giới tính giáo viên: ");
                gender = input.nextLine();
                IllegalGenderException.genderCheck(gender);
                break;
            } catch (IllegalGenderException e) {
                System.out.println(e.getMessage());
                ;
            }
        }

        String specialization;
        while (true) {
            System.out.print("Nhập chuyên môn giáo viên: ");
            specialization = input.nextLine();
            try {
                IllegalFullNameException.nameCheck(specialization);
                break;
            } catch (IllegalFullNameException e) {
                System.out.println(e.getMessage());
                ;
            }
        }


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

    @Override
    public boolean searchByName(String name) {
        boolean flagSearch = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getName().contains(name)) {
                System.out.println("Những giáo viên khớp với tìm kiếm");
                System.out.println(teacherList.get(i));
                flagSearch = true;
            }
        }
        return flagSearch;
    }

    @Override
    public boolean searchByCode(String code) {
        boolean flagSearch = false;
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(code)) {
                System.out.println("Những giáo viên khớp với tìm kiếm");
                System.out.println(teacherList.get(i));
                flagSearch = true;
            }
        }
        return flagSearch;
    }


    public void sortByNameOrID() {
        for (int i = 0; i < teacherList.size(); i++) {
            for (int j = teacherList.size() - 1; j > i; j--) {
                if (teacherList.get(j).getName().compareTo(teacherList.get(j - 1).getName()) < 0) {
                    Teacher temp = teacherList.get(j);
                    teacherList.set(j, teacherList.get(j - 1));
                    teacherList.set(j - 1, temp);
                }
                if (teacherList.get(j).getName().compareTo(teacherList.get(j - 1).getName()) == 0) {
                    if (teacherList.get(j).getCode().compareTo(teacherList.get(j - 1).getCode()) < 0) {
                        Teacher temp = teacherList.get(j);
                        teacherList.set(j, teacherList.get(j - 1));
                        teacherList.set(j - 1, temp);
                    }
                }
            }
        }
    }
}
