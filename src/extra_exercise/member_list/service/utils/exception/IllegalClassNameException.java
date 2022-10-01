package extra_exercise.member_list.service.utils.exception;

public class IllegalClassNameException extends Exception {
    public IllegalClassNameException(String message) {
        super(message);
    }

    public static void classNameCheck(String className) throws IllegalClassNameException {
        if (!className.matches("[C][0][7][a-zA-Z0-9]{2,}")) {
            throw new IllegalClassNameException("Nhập sai định dạng, xin nhập lại tên lớp");
        } else System.out.println("Nhập tên lớp thành công");
    }
}
