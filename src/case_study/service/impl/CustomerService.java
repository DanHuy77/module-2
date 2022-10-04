package case_study.service.impl;

import case_study.model.human.Customer;
import case_study.service.ICustomerService;
import case_study.utils.exception.CaseStudyFormatException;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class CustomerService implements ICustomerService {
    private Scanner input = new Scanner(System.in);
    private static List<Customer> customerList = new LinkedList<>();

    static {
        Customer customer = new Customer("Đặng Nhật Huy", LocalDate.parse("07/07/1996", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "Nam", 2, "0799440683", "b77cwalk@gmail.com", "2", "Platinum", "Đà Nẵng");
        customerList.add(customer);
    }

    public Customer getCustomerInfo() {
        String fullName;
        while (true) {
            try {
                System.out.print("Input Customer's FullName: ");
                CaseStudyFormatException.nameCheck(fullName = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        LocalDate dateOfBirth;
        while (true) {
            try {
                System.out.print("Input Customer's Date of Birth (format: dd/MM/yyyy): ");
                CaseStudyFormatException.customerAgeCheck(dateOfBirth = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
                break;
            } catch (DateTimeException | CaseStudyFormatException exception) {
                System.out.println(exception.getMessage());
            }
        }

        String gender;
        while (true) {
            try {
                System.out.print("Input Customer's Gender (Male or Female): ");
                CaseStudyFormatException.genderCheck(gender = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Input Customer's ID Number: ");
        int IDNumber = Integer.parseInt(input.nextLine());

        String phoneNumber;
        while (true) {
            try {

                System.out.print("Input Customer's Phone Number: ");
                CaseStudyFormatException.phoneNumberCheck(phoneNumber = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String email;
        while (true) {
            try {
                System.out.println("Input Customer's Email (example: abc@gmail.com)");
                System.out.println("Supported Email: gmail.com,yahoo.com,@live.com,@outlook.com,@msn.com,@hotmail.com");
                System.out.print("Input: ");
                CaseStudyFormatException.mailCheck(email = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String customerCode;
        while (true) {
            try {
                System.out.print("Input Customer's Code (Begin with 'C' and contains at least 3 number digits): ");
                CaseStudyFormatException.customerCodeCheck(customerCode = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        String customerType;
        while (true) {
            try {
                System.out.print("Input Customer Type (Diamond | Platinum | Gold | Silver | Member): ");
                CaseStudyFormatException.customerTypeCheck(customerType = input.nextLine());
                break;
            } catch (CaseStudyFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Input Customer's Address: ");
        String customerAddress = input.nextLine();


        return new Customer(fullName, dateOfBirth, gender, IDNumber, phoneNumber, email, customerCode, customerType, customerAddress);
    }


    @Override
    public void displayList() {
        if (customerList.size() != 0) {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        } else {
            System.out.println("There is no Customer in list!");
        }
    }

    @Override
    public void addNew() {
        Customer customer = this.getCustomerInfo();
        customerList.add(customer);
        System.out.println("Added new Customer");
    }

    @Override
    public void editByID() {
        System.out.print("Please Input Customer's ID Number: ");
        int IDNumber = Integer.parseInt(input.nextLine());
        boolean isExist = false;
        for (Customer customer : customerList) {
            if (customer.getIDNumber() == IDNumber) {
                System.out.println("Customer who matched inquisition");
                System.out.println(customer);
                System.out.println("");
                System.out.println("Edit Menu");
                System.out.println("");
                System.out.println("1. Customer's Full Name.");
                System.out.println("2. Customer's Date of Birth.");
                System.out.println("3. Customer's Gender.");
                System.out.println("4. Customer's ID Number.");
                System.out.println("5. Customer's Phone Number.");
                System.out.println("6. Customer Email.");
                System.out.println("7. Customer's Code");
                System.out.println("8. Customer Type.");
                System.out.println("9. Customer's Address.");

                System.out.println("");
                System.out.println("Which information you want to edit?");
                System.out.print("Input choice: ");
                int editChoice = Integer.parseInt(input.nextLine());
                switch (editChoice) {
                    case 1:
                        System.out.print("Set new Full Name: ");
                        customer.setFullName(input.nextLine());
                        break;
                    case 2:
                        System.out.print("Set new Date of Birth: ");
                        customer.setDateOfBirth(LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                        break;
                    case 3:
                        System.out.print("Set new Gender: ");
                        customer.setGender(input.nextLine());
                        break;
                    case 4:
                        System.out.print("Set new ID Number: ");
                        customer.setIDNumber(Integer.parseInt(input.nextLine()));
                        break;
                    case 5:
                        System.out.print("Set new Phone Number: ");
                        customer.setPhoneNumber(input.nextLine());
                        break;
                    case 6:
                        System.out.print("Set new Email: ");
                        customer.setEmail(input.nextLine());
                        break;
                    case 7:
                        System.out.print("Set new Code: ");
                        customer.setCustomerCode(input.nextLine());
                        break;
                    case 8:
                        System.out.print("Set new Customer Type: ");
                        customer.setCustomerType(input.nextLine());
                        break;
                    case 9:
                        System.out.print("Set new Address: ");
                        customer.setAddress(input.nextLine());
                        break;
                    default:
                        System.out.println("Wrong choice! Please choose again.");
                }
                System.out.println("Edited!");
                isExist = true;
                break;
            }

        }
        if (!isExist) {
            System.out.println("Wrong ID Number");
        }

    }

}
