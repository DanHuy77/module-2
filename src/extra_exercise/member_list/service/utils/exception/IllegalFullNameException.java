package extra_exercise.member_list.service.utils.exception;


public class IllegalFullNameException extends Exception {
    public IllegalFullNameException(String message) {
        super(message);
    }

    public static void nameCheck(String name) throws IllegalFullNameException {

        String[] arrName = name.trim().split(" ");
        for (String s : arrName) {
            if (!s.matches("[A-ZĐ][a-záàảạãăắằặẵâấầẫậẩéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịùúủũụưứửữựỵỷỹýỳ]{1,5}")) {
                throw new IllegalFullNameException("Tên không khớp chuẩn tiếng Việt, xin nhập lại");
            }
        }
        System.out.println("Nhập dữ liệu thành công");
    }
}