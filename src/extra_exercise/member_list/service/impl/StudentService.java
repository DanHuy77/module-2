package extra_exercise.member_list.service.impl;

import extra_exercise.member_list.service.utils.files.WriteToFile;
import extra_exercise.member_list.model.Student;
import extra_exercise.member_list.service.IMemberService;
import extra_exercise.member_list.service.utils.exception.IllegalFullNameException;
import extra_exercise.member_list.service.utils.exception.IllegalGenderException;
import extra_exercise.member_list.service.utils.exception.IllegalInputException;
import extra_exercise.member_list.service.utils.exception.ValidPointException;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;


public class StudentService implements IMemberService {
    private static final Scanner input = new Scanner(System.in);
    public static final List<Student> studentList = new ArrayList<>();
    private static final WriteToFile writeToFile = new WriteToFile();

    public Student inputStudentInformation() {
        String code;
        while (true) {

            try {
                System.out.print("Nhập mã học sinh (Chỉ chứa ký tự alphabet và số, độ dài từ 3~6 ký tự): ");
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
                System.out.print("Nhập tên học sinh: ");
                name = input.nextLine();
                IllegalFullNameException.nameCheck(name);
                break;
            } catch (IllegalFullNameException e) {
                System.out.println(e.getMessage());
            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday;
        while (true) {
            try {
                System.out.print("Nhập ngày sinh học sinh (định dạng dd/MM/yyyy): ");
                birthday = LocalDate.parse(input.nextLine(), formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Không đúng định dạng, xin nhập lại.");
            }
        }

        String gender;
        while (true) {
            System.out.print("Nhập giới tính học sinh: ");
            gender = input.nextLine();
            try {
                IllegalGenderException.genderCheck(gender);
                break;
            } catch (IllegalGenderException e) {
                System.out.println(e.getMessage());
            }
        }

        String className;
        while (true) {
            System.out.print("Nhập tên lớp của học sinh (Chỉ chứa ký tự alphabet và số, độ dài từ 3~6 ký tự): ");
            className = input.nextLine();
            try {
                IllegalInputException.validInputCheck(code);
                break;
            } catch (IllegalInputException e) {
                System.out.println(e.getMessage());
            }
        }

        double point;
        while (true) {
            System.out.print("Nhập điểm học sinh: ");
            point = Double.parseDouble(input.nextLine());
            try {
                ValidPointException.pointCheck(point);
                break;
            } catch (ValidPointException e) {
                System.out.println(e.getMessage());
                ;
            }
        }

        return new Student(code, name, birthday, gender, className, point);
    }

    @Override
    public void addMember() throws IOException {
        Student student = this.inputStudentInformation();

        studentList.add(student);

        writeToFile.addFileStudent();
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeMember() throws IOException {
        System.out.print("Mời bạn nhập mã học sinh cần xóa: ");
        String code = input.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println("Bạn có chắc muốn xóa học sinh này không? Nhập Y: yes, N: no");
                String choice = input.nextLine();
                if (choice.equals("Y")) {
                    studentList.remove(i);
                    System.out.println("Xóa thành công");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy đối tượng cần xóa.");
        }
    writeToFile.addFileStudent();
    }

    @Override
    public void displayList() {
        if (studentList.size() != 0) {
            for (Student student : studentList) {
                System.out.println(student);
            }
        } else {
            System.out.println("Danh sách hiện tại không có thành viên nào.");
        }
    }

    @Override
    public boolean searchByName(String name) {
        boolean flagSearch = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(name)) {
                System.out.println("Những học sinh khớp với tìm kiếm");
                System.out.println(studentList.get(i));
                flagSearch = true;

            }
        }

        return flagSearch;
    }

    @Override
    public boolean searchByCode(String code) {
        boolean flagSearch = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                System.out.println("Những học sinh khớp với tìm kiếm");
                System.out.println(studentList.get(i));
                flagSearch = true;
            }
        }
        return flagSearch;
    }

    @Override
    public void sortByNameOrID() {
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//
//                String name1 = o1.getName().substring(o1.getName().lastIndexOf(" ") + 1);
//                String name2 = o2.getName().substring(o2.getName().lastIndexOf(" ") + 1);
//                int compareName = name1.compareTo(name2);
//                if (compareName == 0) {
//                    return o1.getCode().compareTo(o2.getCode());
//                } else {
//                    return compareName;
//                }
//            }
//        });

        for (int i = 0; i < studentList.size(); i++) {
            for (int j = studentList.size() - 1; j > i; j--) {
                if (studentList.get(j).getName().compareTo(studentList.get(j - 1).getName()) < 0) {
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j - 1));
                    studentList.set(j - 1, temp);
                }
                if (studentList.get(j).getName().compareTo(studentList.get(j - 1).getName()) == 0) {
                    if (studentList.get(j).getCode().compareTo(studentList.get(j - 1).getCode()) < 0) {
                        Student temp = studentList.get(j);
                        studentList.set(j, studentList.get(j - 1));
                        studentList.set(j - 1, temp);
                    }
                }
            }
        }


    }


//    static {
//        Student student1 = new Student("st5", "Nguyễn Văn A", "12/12/2000", "Nam", "C07", 10);
//        Student student2 = new Student("st3", "Nguyễn Văn B", "20 / 12 / 2000", "Nam", "C07", 10);
//        Student student3 = new Student("st12", "Nguyễn Văn C", "20 / 12 / 2000", "Nam", "C07", 10);
//        Student student4 = new Student("st10", "Nguyễn Văn C", "22 / 12 / 2222", "Nam", "C07", 10);
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//    }


}

