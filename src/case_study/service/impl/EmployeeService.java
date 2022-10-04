package case_study.service.impl;

import case_study.model.human.Customer;
import case_study.model.human.Employee;
import case_study.service.IEmployeeService;
import case_study.utils.exception.CaseStudyFormatException;
import case_study.utils.unique_properties.UniqueProperties;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public Scanner input = new Scanner(System.in);
    public static List<Employee> employeeList = new ArrayList<>();

//    static {
//        Employee employee = new Employee("Đặng Nhật Huy", LocalDate.parse("07/07/1996", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Nam", 1, "0799440683", "b77cwalk@gmail.com", "a", "ĐH", "NV", Integer.parseInt("10000"));
//        employeeList.add(employee);
//    }


    public Employee getEmployeeInfo() {
        String fullName;
        while (true) {
            try {
                System.out.print("Input Employee Full Name: ");
                CaseStudyFormatException.nameCheck(fullName = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        LocalDate dateOfBirth;
        while (true) {
            try {
                System.out.print("Input Employee's Date of Birth (format: dd/MM/yyyy): ");
                CaseStudyFormatException.employeeAgeCheck(dateOfBirth = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                break;
            } catch (CaseStudyFormatException | DateTimeException exception) {
                System.out.println(exception.getMessage());
            }
        }

        String gender;
        while (true) {
            try {
                System.out.print("Input Employee Gender: ");
                CaseStudyFormatException.genderCheck(gender = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        String IDNumber;
        while (true) {
            try {
                System.out.print("Input Employee ID Number: ");
                CaseStudyFormatException.IDUniqueCheck(IDNumber = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String phoneNumber;
        while (true) {
            try {
                System.out.print("Input Employee's Phone Number: ");
                CaseStudyFormatException.phoneNumberCheck(phoneNumber = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String email;
        while (true) {
            try {
                System.out.print("Input Employee's Email: ");
                CaseStudyFormatException.mailCheck(email = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String employeeCode;
        while (true) {
            try {
                System.out.print("Input Employee's Code (Begin with E and contains at least 3 number digits): ");
                CaseStudyFormatException.employeeCodeCheck(employeeCode = input.nextLine());
                CaseStudyFormatException.employeeCodeUniqueCheck(employeeCode);
                UniqueProperties.employeeCodeList.add(employeeCode);
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String educationLevel = "";
        System.out.println("Input Employee's Education Level");
        System.out.println("1. Intermediate");
        System.out.println("2. College");
        System.out.println("3. University");
        System.out.println("4. After-University");
        System.out.println("");
        int eduChoice;
        while (true) {
            try {
                System.out.print("Input your choice: ");
                eduChoice = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Choice must be a number digit, please try again");
            }
        }
        switch (eduChoice) {
            case 1:
                educationLevel = "Intermediate";
                break;
            case 2:
                educationLevel = "College";
                break;
            case 3:
                educationLevel = "University";
                break;
            case 4:
                educationLevel = "After-University";
                break;
            default:
                System.out.println("Wrong Choice. Please try again.");
        }

        String position = "";
        System.out.println("Input Employee's Position");
        System.out.println("1. Receptionist");
        System.out.println("2. Servants");
        System.out.println("3. Experts");
        System.out.println("4. Supervisor");
        System.out.println("5. Manager");
        System.out.println("6. Director");
        System.out.println("");

        int positionChoice;
        while (true) {
            try {
                System.out.print("Input your choice: ");
                positionChoice = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Choice must be a number digit, please try again");
            }
        }

        switch (positionChoice) {
            case 1:
                position = "Receptionist";
                break;
            case 2:
                position = "Servants";
                break;
            case 3:
                position = "Experts";
                break;
            case 4:
                position = "Supervisor";
                break;
            case 5:
                position = "Manager";
                break;
            case 6:
                position = "Director";
                break;
            default:
                System.out.println("There is no such as position!");
        }

        System.out.println("Input Employee's Salary");
        double salary = Double.parseDouble(input.nextLine());
        return new

                Employee(fullName, dateOfBirth, gender, IDNumber, phoneNumber, email, employeeCode, educationLevel, position, salary);

    }


    @Override
    public void displayList() throws IOException {
        employeeList = readFileEmployee();
        if (employeeList.size() != 0) {
            for (int i = 0; i < employeeList.size(); i++) {
                System.out.println(employeeList.get(i).toString());
            }
        } else {
            System.out.println("There is no Employee in list!");
        }
    writeFileEmployee(employeeList);
    }

    @Override
    public void addNew() throws IOException {
        employeeList = readFileEmployee();
        Employee employee = this.getEmployeeInfo();
        employeeList.add(employee);
        writeFileEmployee(employeeList);
        System.out.println("Added new Employee.");
    }


    @Override
    public void editByID() throws IOException {
        employeeList = readFileEmployee();
        System.out.print("Please Input Employee's ID Number: ");
        String IDNumber = input.nextLine();
        boolean isExist = false;
        readFileEmployee();
        if (employeeList.size() != 0) {

            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getIDNumber().equals(IDNumber)) {
                    employeeList.set(i, getEmployeeInfo());
                    writeFileEmployee(employeeList);
                    isExist = true;
                    break;
                }
            }
        }
        writeFileEmployee(employeeList);
        if (!isExist) {
            System.out.println("Wrong ID Number");
        }

    }

    private String employeeFileForm(Employee employee) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%.0f", employee.getFullName(), employee.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), employee.getGender(), employee.getIDNumber(), employee.getPhoneNumber(), employee.getEmail(), employee.getEmployeeCode(), employee.getEducationLevel(), employee.getPosition(), employee.getSalary());
    }

    private void writeFileEmployee(List<Employee> employeeList) throws IOException {
        File file = new File("src\\case_study\\data\\employee.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Employee employee : employeeList) {
            bufferedWriter.write(employeeFileForm(employee));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }


    private List<Employee> readFileEmployee() throws IOException {
        File file = new File("src\\case_study\\data\\employee.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        List<Employee> employeeList = new ArrayList<>();
        String line;
        String[] properties;
        Employee employee;
        while ((line = bufferedReader.readLine()) != null) {
            properties = line.split(",");
            employee = new Employee(properties[0], LocalDate.parse(properties[1], DateTimeFormatter.ofPattern("dd/MM/yyyy")), properties[2], properties[3], properties[4], properties[5], properties[6], properties[7], properties[8], Double.parseDouble(properties[9]));
            UniqueProperties.IDList.add(properties[3]);
            UniqueProperties.employeeCodeList.add(properties[6]);
            employeeList.add(employee);
        }
        bufferedReader.close();
        return employeeList;
    }
}
