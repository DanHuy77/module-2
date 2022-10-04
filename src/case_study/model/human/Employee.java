package case_study.model.human;

import java.time.LocalDate;

public class Employee extends CaseStudyPerson {
    private String employeeCode;
    private String educationLevel;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String fullName, LocalDate dateOfBirth, String gender, String IDNumber, String phoneNumber, String email, String employeeCode, String educationLevel, String position, double salary) {
        super(fullName, dateOfBirth, gender, IDNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String employeeCode, String educationLevel, String position, double salary) {
        this.employeeCode = employeeCode;
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }


    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
