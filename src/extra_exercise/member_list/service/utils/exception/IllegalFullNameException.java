package extra_exercise.member_list.service.utils.exception;


public class IllegalFullNameException extends Exception {
    public IllegalFullNameException(String message) {
        super(message);
    }

    public static boolean nameCheck(String name) throws IllegalFullNameException {

        if (!name.matches("^[a-zA-Z'-'\\sáàảãạăâắằấầặẵẫậéèẻ ẽẹếềểễệóòỏõọôốồổỗộ ơớờởỡợíìỉĩịđùúủũụưứ� �ửữựÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠ ƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼ� ��ỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞ ỠỢỤỨỪỬỮỰỲỴÝỶỸửữựỵ ỷỹ]{2,30}")){
            throw new IllegalFullNameException("Dữ liệu không hợp lệ, xin nhập lại.");
        } else {
            System.out.println("Nhập tên thành công.");
            return true;
        }
    }
}