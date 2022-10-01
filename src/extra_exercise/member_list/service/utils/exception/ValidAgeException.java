package extra_exercise.member_list.service.utils.exception;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class ValidAgeException extends Exception {
    public ValidAgeException(String message) {
        super(message);
    }

    public static void ageCheck(LocalDate birthday) throws ValidAgeException {
        int year = birthday.getYear();
        int presentYear = LocalDate.now().getYear();
        if (presentYear - year < 18) {
            throw new ValidAgeException("Thành viên không đủ tuổi.");
        } else System.out.println("Nhập tuổi thành công");
    }
}
