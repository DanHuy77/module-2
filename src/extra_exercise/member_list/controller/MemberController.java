package extra_exercise.member_list.controller;

import extra_exercise.member_list.service.IMemberService;
import extra_exercise.member_list.service.impl.StudentService;
import extra_exercise.member_list.service.impl.TeacherService;

import java.io.IOException;
import java.util.Scanner;

public class MemberController {
    private static final IMemberService iStudentService = new StudentService();
    private static final IMemberService iTeacherService = new TeacherService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuMember() throws IOException {
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Chào mừng bạn đến với chương trình quản lý CodeGym");
            System.out.println("1. Thêm mới thành viên");
            System.out.println("2. Hiển thị danh sách thành viên");
            System.out.println("3. Xóa thành viên");
            System.out.println("4. Tìm kiếm thành viên theo tên");
            System.out.println("5. Tìm kiếm thành viên theo mã thành viên");
            System.out.println("6. Sắp xếp theo tên thành viên");
            System.out.println("7. Thoát\n");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("- Hãy lựa chọn -");
                    System.out.println("1. Thêm mới học sinh");
                    System.out.println("2. Thêm mới giáo viên\n");
                    System.out.print("Nhập lựa chọn: ");
                    int secondChoice = Integer.parseInt(scanner.nextLine());
                    if (secondChoice == 1) {
                        iStudentService.addMember();
                    } else if (secondChoice == 2) {
                        iTeacherService.addMember();
                    } else {
                        System.out.println("Lựa chọn sai, xin chọn lại");
                    }

                    break;
                case 2:
                    System.out.println("- Hãy lựa chọn -");
                    System.out.println("1. Hiển thị danh sách học sinh");
                    System.out.println("2. Hiển thị danh sách giáo viên\n");
                    System.out.print("Nhập lựa chọn: ");
                    int thirdChoice = Integer.parseInt(scanner.nextLine());
                    if (thirdChoice == 1) {
                        iStudentService.displayList();
                    } else if (thirdChoice == 2) {
                        iTeacherService.displayList();
                    } else {
                        System.out.println("Lựa chọn sai, xin chọn lại");
                    }
                    break;
                case 3:
                    System.out.println("- Hãy lựa chọn -");
                    System.out.println("1. Xóa học sinh");
                    System.out.println("2. Xóa giáo viên\n");
                    System.out.print("Nhập lựa chọn: ");
                    int forthChoice = Integer.parseInt(scanner.nextLine());
                    if (forthChoice == 1) {
                        iStudentService.removeMember();
                    } else if (forthChoice == 2) {
                        iTeacherService.removeMember();
                    } else {
                        System.out.println("Lựa chọn sai, xin chọn lại.");
                    }
                    break;

                case 4:
                    System.out.println("Mời nhập tên thành viên cần tìm: ");
                    String name = scanner.nextLine();
                    boolean isFound = iStudentService.searchByName(name) && iTeacherService.searchByName(name);
                    if (!isFound) {
                        System.out.println("Không tìm thấy thành viên");
                    }
                    break;

                case 5:
                    System.out.println("Mời nhập mã thành viên cần tìm: ");
                    String code = scanner.nextLine();
                    boolean isFoundByCode = iStudentService.searchByCode(code) && iTeacherService.searchByCode(code);
                    if (!isFoundByCode) {
                        System.out.println("Không tìm thấy thành viên");
                    }
                    break;

                case 6:
                    System.out.println("- Hãy lựa chọn -");
                    System.out.println("1. Sắp xếp danh sách học sinh");
                    System.out.println("2. Sắp xếp danh sách giáo viên\n");
                    System.out.print("Nhập lựa chọn: ");
                    int fifthChoice = Integer.parseInt(scanner.nextLine());
                    if (fifthChoice == 1) {
                        iStudentService.sortByNameOrID();
                    } else if (fifthChoice == 2) {
                        iTeacherService.sortByNameOrID();
                    } else {
                        System.out.println("Lựa chọn sai, xin chọn lại.");
                    }
                    break;
                case 7:
                    System.out.println("Cảm ơn đã sử dụng ứng dụng");
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này!");
            }
        }
    }
}

