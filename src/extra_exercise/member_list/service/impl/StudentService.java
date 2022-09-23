package extra_exercise.member_list.service.impl;

import extra_exercise.member_list.model.Student;
import extra_exercise.member_list.model.Teacher;
import extra_exercise.member_list.service.IMemberService;

import java.util.*;

public class StudentService implements IMemberService {
    private static final Scanner input = new Scanner(System.in);
    private static final List<Student> studentList = new ArrayList<>();

    public Student inputStudentInformation() {
        System.out.print("Nhập mã học sinh: ");
        String code = input.nextLine();
        System.out.print("Nhập tên học sinh: ");
        String name = input.nextLine();

        String birthday;
        do {
            System.out.print("Nhập ngày sinh của học sinh. (Định dạng: dd/mm/yyyy): ");
            birthday = input.nextLine();
            if (!birthday.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
                System.out.println(("Không đúng định đạng, mời nhập lại."));
            }
        } while (!birthday.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"));
        System.out.print("Nhập giới tính học sinh: ");
        String gender = input.nextLine();
        if (gender.equals("Nam")) {
            gender = "Nam";
        } else if (gender.equals("Nữ")) {
            gender = "Nữ";
        } else {
            gender = "Undefined. ";
        }

        System.out.print("Nhập tên lớp của học sinh: ");
        String className = input.nextLine();

        System.out.print("Nhập điểm học sinh: ");
        double point = Double.parseDouble(input.nextLine());

        return new Student(code, name, birthday, gender, className, point);
    }

    @Override
    public void addMember() {
        Student student = this.inputStudentInformation();

        studentList.add(student);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeMember() {
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


    static {
        Student student1 = new Student("st5", "Nguyễn Văn A", "20/20/2000", "Nam", "C07", 10);
        Student student2 = new Student("st3", "Nguyễn Văn B", "20/20/2000", "Nam", "C07", 10);
        Student student3 = new Student("st12", "Nguyễn Văn C", "20/20/2000", "Nam", "C07", 10);
        Student student4 = new Student("st10", "Nguyễn Văn C", "22/22/2222", "Nam", "C07", 10);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }
}

