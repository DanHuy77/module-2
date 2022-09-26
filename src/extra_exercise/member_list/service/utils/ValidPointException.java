package extra_exercise.member_list.service.utils;

public class ValidPointException extends Exception {
    public ValidPointException(String message) {
        super(message);
    }

    public static void pointCheck(double points) throws ValidPointException {
        if (points < 0 || points > 10) {
            throw new ValidPointException("Vui lòng nhập lại điểm trong khoảng từ 0-10.");
        } else System.out.println("Nhập điểm thành công.");
    }
}
