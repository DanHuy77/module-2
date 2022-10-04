package case_study.utils.exception;

import extra_exercise.member_list.service.utils.exception.IllegalFullNameException;
import extra_exercise.member_list.service.utils.exception.IllegalGenderException;
import extra_exercise.member_list.service.utils.exception.ValidAgeException;

import java.time.LocalDate;

public class CaseStudyFormatException extends Exception {
    public CaseStudyFormatException(String message) {
        super(message);
    }

    public static void nameCheck(String name) throws CaseStudyFormatException {

        String[] arrName = name.trim().split(" ");
        for (String s : arrName) {
            if (!s.matches("[A-ZĐ][a-záàảạãăắằặẵâấầẫậẩéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịùúủũụưứửữựỵỷỹýỳ]{1,5}")) {
                throw new CaseStudyFormatException("It's not a valid name, please try again.");
            }
        }
        System.out.println("Input Succeeded");
    }

    public static void genderCheck(String gender) throws CaseStudyFormatException {
        if (!gender.matches("(Male|Female|male|female)")) {
            throw new CaseStudyFormatException("Gender must be male or female, please try again.");
        } else {
            System.out.println("Input Succeeded.");
        }
    }

    public static void employeeAgeCheck(LocalDate birthday) throws CaseStudyFormatException {
        int year = birthday.getYear();
        int presentYear = LocalDate.now().getYear();
        if (presentYear - year < 18) {
            throw new CaseStudyFormatException("Employee must not be under 18 years old, please try again.");
        } else System.out.println("Input Date of Birth Succeeded");
    }

    public static void customerAgeCheck(LocalDate birthday) throws CaseStudyFormatException {
        int year = birthday.getYear();
        int presentYear = LocalDate.now().getYear();
        if (presentYear - year < 18) {
            throw new CaseStudyFormatException("Customer must not be under 18 years old, please try again.");
        } else System.out.println("Input Date of Birth Succeeded");
    }

    public static void phoneNumberCheck(String phoneNumber) throws CaseStudyFormatException {
        if (!phoneNumber.matches("[0-9]{10,11}")) {
            throw new CaseStudyFormatException("Phone number must contains 10 to 11 number digits, please try again");
        } else System.out.println("Input Phone Number Succeeded");
    }

    public static void mailCheck(String email) throws CaseStudyFormatException {
        if (!email.matches("[A-Za-z0-9]{5,30}[@](gmail.com|yahoo.com|@live.com|@outlook.com|@msn.com|@hotmail.com)")) {
            throw new CaseStudyFormatException("It's not a valid email, please try again.");
        } else System.out.println("Input Succeeded");
    }

    public static void customerCodeCheck(String code) throws CaseStudyFormatException {
        if (!code.matches("[C][0-9]{1,3}")) {
            throw new CaseStudyFormatException("Wrong Customer format Code, please try again.");
        } else System.out.println("Input Succeeded");
    }

    public static void employeeCodeCheck(String code) throws CaseStudyFormatException {
        if (!code.matches("[E][0-9]{1,3}")) {
            throw new CaseStudyFormatException("Wrong Employee format Code, please try again");
        } else System.out.println("Input Succeeded");
    }

    public static void customerTypeCheck(String customerType) throws CaseStudyFormatException {
        if (!customerType.matches("(Diamond|Platinum|Gold|Silver|Member)")) {
            throw new CaseStudyFormatException("Wrong Customer Type, please try again");
        } else System.out.println("Input Succeeded");
    }

    public static void IDNumberCheck(String IDNumber) throws CaseStudyFormatException {
        if (!IDNumber.matches("[0-9]{9}")) {
            throw new CaseStudyFormatException("ID Number must contains 9 number digits, please try again.");
        } else System.out.println("Input Succeeded");
    }
}

