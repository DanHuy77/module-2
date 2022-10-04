package case_study.model.human;

import java.time.LocalDate;

public class Customer extends CaseStudyPerson {
    private String customerCode;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String fullName, LocalDate dateOfBirth, String gender, String IDNumber, String phoneNumber, String email, String customerCode, String customerType, String address) {
        super(fullName, dateOfBirth, gender, IDNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String customerCode, String customerType, String address) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
