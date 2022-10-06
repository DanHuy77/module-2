package case_study.controller;

import case_study.service.*;
import case_study.service.impl.*;
import case_study.utils.exception.CaseStudyFormatException;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {

    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static ICustomerService iCustomerService = new CustomerService();
    private static IFacilityService iFacilityService = new FacilityService();
    private static IContractService iContractService = new ContractService();
    private static IBookingService iBookingService = new BookingService();

    public static Scanner input = new Scanner(System.in);


    public static void displayMainMenu() throws IOException, CaseStudyFormatException {
        while (true) {
            System.out.println("********** WELCOME TO FURAMA SERVICE MANAGER **********");
            System.out.println("********************** MAIN MENU **********************");
            System.out.println("");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit\n");

            int choice;
            while (true) {
                try {
                    System.out.print("Please Input Your Choice: ");
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException exception) {
                    System.out.println("Choice must be a number digit, please try again");
                }
            }
            switch (choice) {
                case 1:
                    FuramaController.employeeMenu();
                    break;
                case 2:
                    FuramaController.customerMenu();
                    break;
                case 3:
                    FuramaController.facilityMenu();
                    break;
                case 4:
                    FuramaController.bookingMenu();
                    break;
                case 5:
                    FuramaController.promotionMenu();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice! Please choose again.");
            }
        }

    }


    private static void employeeMenu() throws IOException {
        boolean flag = true;
        while (flag) {
            System.out.println("");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return main menu");
            System.out.println("");

            int choice;
            while (true) {
                try {
                    System.out.print("Please Choose: ");
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Choice must be a number digit, please try again");
                }
            }
            switch (choice) {
                case 1:
                    iEmployeeService.displayList();
                    break;
                case 2:
                    iEmployeeService.addNew();
                    break;
                case 3:
                    iEmployeeService.editByID();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Please choose again.");
            }
        }
    }

    private static void customerMenu() throws IOException, CaseStudyFormatException {
        boolean flag = true;
        while (flag) {
            System.out.println("");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customers");
            System.out.println("3. Edit list customers");
            System.out.println("4. Return main menu");
            System.out.println("");

            int choice;
            while (true) {
                try {
                    System.out.print("Please Choose: ");
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Choice must be a number digit, please try again");
                }
            }
            switch (choice) {
                case 1:
                    iCustomerService.displayList();
                    break;
                case 2:
                    iCustomerService.addNew();
                    break;
                case 3:
                    iCustomerService.editByID();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Please choose again.");
            }
        }

    }

    private static void facilityMenu() throws IOException, CaseStudyFormatException {
        boolean flag = true;
        while (flag) {
            System.out.println("");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.println("");

            int choice;
            while (true) {
                try {
                    System.out.print("Please Choose: ");
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Choice must be a number digit, please try again");
                }
            }
            switch (choice) {
                case 1:
                    iFacilityService.displayList();
                    break;
                case 2:
                    FuramaController.addFacilityMenu();
                    break;
                case 3:
                    FacilityService.displayFacilityMaintenance();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Please choose again.");
            }
        }

    }

    private static void bookingMenu() throws IOException {
        boolean flag = true;
        while (flag) {
            System.out.println("");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("");

            int choice;
            while (true) {
                try {
                    System.out.print("Please Choose: ");
                    choice = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Choice must be a number digit, please try again");
                }
            }
            switch (choice) {
                case 1:
                    iBookingService.addNewBooking();
                    break;
                case 2:
                    iBookingService.displayList();
                    break;
                case 3:
                    iContractService.createNewContract();
                    break;
                case 4:
                    iContractService.displayList();
                    break;
                case 5:
                    iContractService.edit();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong choice! Please choose again.");
            }
        }

    }

    private static void promotionMenu() {
        System.out.println("");
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");

        System.out.println("");
        System.out.print("Please Choose: ");
        int choice = Integer.parseInt(input.nextLine());
    }


    private static void addFacilityMenu() throws IOException, CaseStudyFormatException {
        System.out.println("-Add Facility Menu-");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Return Main Menu");
        System.out.println("");
        System.out.print("Please choose: ");
        iFacilityService.addNew();
    }
}
