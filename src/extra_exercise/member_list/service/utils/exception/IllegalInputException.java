package extra_exercise.member_list.service.utils.exception;

public class IllegalInputException extends Exception {
    public IllegalInputException(String message) {
        super(message);
    }

    public static void validInputCheck(String input) throws IllegalInputException {
        if (!input.matches("[C][O][D][E][0-9]{3,}")) {
            throw new IllegalInputException("Không được chứa ký tự đặc biệt, xin nhập lại.");
        } else System.out.println("Nhập dữ liệu thành công.");
    }
}
