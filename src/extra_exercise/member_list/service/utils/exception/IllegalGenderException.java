package extra_exercise.member_list.service.utils.exception;

public class IllegalGenderException extends Exception {
    public IllegalGenderException(String message) {
        super(message);
    }

    public static void genderCheck(String gender) throws IllegalGenderException {
        if (!gender.matches("(Nam|Nữ)")){
            throw new IllegalGenderException("Dữ liệu nhập không đúng, xin nhập lại.");
        } else {
            System.out.println("Nhập giới tính thành công.");
        }
    }
}
