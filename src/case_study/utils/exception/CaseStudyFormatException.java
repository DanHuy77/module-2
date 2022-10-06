package case_study.utils.exception;

import case_study.utils.unique_properties.UniqueProperties;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;


import javax.crypto.spec.PSource;
import java.time.LocalDate;

public class CaseStudyFormatException extends Exception {


    public CaseStudyFormatException(String message) {
        super(message);
    }

    public static void nameCheck(String name) throws CaseStudyFormatException {

        String[] arrName = name.trim().split(" ");
        for (String s : arrName) {
            if (!s.matches("[A-ZĐÂĂ][a-záàảạãăắằặẵâấầẫậẩéèẻẽẹêếềểễệóòỏõọôốồổỗộơớờởỡợíìỉĩịùúủũụưứửữựỵỷỹýỳ]{2,}")) {
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
        LocalDate presentDate = LocalDate.now().plusYears(-18);
        LocalDate maxDate = LocalDate.now().plusYears(-100);
        if (!birthday.isBefore(presentDate) || !birthday.isAfter(maxDate)) {
            throw new CaseStudyFormatException("Employee must not be under 18 or over 100 years old, please try again.");
        } else System.out.println("Input Date of Birth Succeeded");
    }


    public static void customerAgeCheck(LocalDate birthday) throws CaseStudyFormatException {
        LocalDate presentDate = LocalDate.now().plusYears(-18);
        LocalDate maxDate = LocalDate.now().plusYears(-100);
        if (!birthday.isBefore(presentDate)) {
            throw new CaseStudyFormatException("Customer must not be under 18 years old, please try again.");
        } else if (!birthday.isAfter(maxDate)) {
            throw new CaseStudyFormatException("Customer must not be over 100 years old, please try again.");
        } else System.out.println("Input Date of Birth Succeeded");
    }

    public static void phoneNumberCheck(String phoneNumber) throws CaseStudyFormatException {
        if (!phoneNumber.matches("[0-9]{10,11}")) {
            throw new CaseStudyFormatException("Phone number must contains 10 to 11 number digits, please try again");
        } else System.out.println("Input Phone Number Succeeded");
    }

    public static void mailCheck(String email) throws CaseStudyFormatException {
        if (!email.matches("[A-Za-z0-9_]{5,30}[@](gmail.com|yahoo.com|@live.com|@outlook.com|@msn.com|@hotmail.com)")) {
            throw new CaseStudyFormatException("It's not a valid email, please try again.");
        } else System.out.println("Input Succeeded");
    }

    public static void customerCodeCheck(String code) throws CaseStudyFormatException {
        if (!code.matches("[C][0-9]{3,}")) {
            throw new CaseStudyFormatException("Wrong Customer format Code, please try again.");
        } else System.out.println("Input Succeeded");
    }

    public static void employeeCodeCheck(String code) throws CaseStudyFormatException {
        if (!code.matches("[E][0-9]{3,}")) {
            throw new CaseStudyFormatException("Wrong Employee format Code, please try again");
        } else System.out.println("Input Succeeded");
    }

    public static void customerTypeCheck(String customerType) throws CaseStudyFormatException {
        if (!customerType.matches("(Diamond|Platinum|Gold|Silver|Member)")) {
            throw new CaseStudyFormatException("Wrong Customer Type, please try again");
        } else System.out.println("Input Succeeded");
    }

    public static void IDNumberCheck(String IDNumber) throws CaseStudyFormatException {
        if (!IDNumber.matches("")) {
            throw new CaseStudyFormatException("ID Number must contains 9 number digits, please try again.");
        } else System.out.println("Input Succeeded");
    }

    public static void IDUniqueCheck(String IDNumber) throws CaseStudyFormatException {

        if (UniqueProperties.IDList.size() > 0) {
            for (String s : UniqueProperties.IDList) {
                if (s.equals(IDNumber)) {
                    throw new CaseStudyFormatException("This ID Number is already existed, please try again.");
                }
            }
        }
        System.out.println("Input ID Number Succeed.");
    }

    public static void employeeCodeUniqueCheck(String code) throws CaseStudyFormatException {
        if (UniqueProperties.employeeCodeList.size() > 0) {
            for (String s : UniqueProperties.employeeCodeList) {
                if (s.equals(code)) {
                    throw new CaseStudyFormatException("This employee code is already existed, please try again.");
                }
            }
        }
        System.out.println("Input Employee Code Succeeded");
    }

    public static void customerCodeUniqueCheck(String code) throws CaseStudyFormatException {
        if (UniqueProperties.customerCodeList.size() > 0) {
            for (String s : UniqueProperties.customerCodeList) {
                if (s.equals(code)) {
                    throw new CaseStudyFormatException("This customer code is already existed, please try again.");
                }
            }
        }
        System.out.println("Input Customer Code Succeeded");
    }

    public static void serviceCodeUniqueCheck(String code) throws CaseStudyFormatException {
        if (UniqueProperties.facilityServiceCodeList.size() > 0) {
            for (String s : UniqueProperties.facilityServiceCodeList) {
                if (s.equals(code)) {
                    throw new CaseStudyFormatException("This Service code is already existed, please try again.");
                }
            }
        }
        System.out.println("Input Service Code Succeeded");
    }

    public static void areaCheck(double area) throws CaseStudyFormatException {
        if (area <= 30) {
            throw new CaseStudyFormatException("Area must be larger than 30m2, please try again.");
        }
        System.out.println("Input Area Succeeded.");
    }

    public static void userNumberCheck(int number) throws CaseStudyFormatException {
        if (number < 0 || number > 20) {
            throw new CaseStudyFormatException("User Number must be between 0 and 20, please try again.");
        }
        System.out.println("Input User Number Succeeded.");
    }

    public static void floorNumberCheck(int floorNumber) throws CaseStudyFormatException {
        if (floorNumber < -1) {
            throw new CaseStudyFormatException("Floor Number must be a Integer and not a minus digit, please try again.");
        } else System.out.println("Input FLoor Number Succeeded.");
    }

    public static void villaCodeCheck(String code) throws CaseStudyFormatException {
        if (!code.matches("[S][V][V][L][-][0-9]{4}")) {
            throw new CaseStudyFormatException("Invalid Villa Code, please try again.");
        }
        System.out.println("Input Villa Code Succeeded.");
    }

    public static void houseCodeCheck(String code) throws CaseStudyFormatException {
        if (!code.matches("[S][V][H][O][-][0-9]{4}")) {
            throw new CaseStudyFormatException("Invalid House Code, please try again.");
        }
        System.out.println("Input House Code Succeeded.");
    }

    public static void roomCodeCheck(String code) throws CaseStudyFormatException {
        if (!code.matches("[S][V][R][O][-][0-9]{4}")) {
            throw new CaseStudyFormatException("Invalid House Code, please try again.");
        }
        System.out.println("Input Room Code Succeeded.");
    }
}
