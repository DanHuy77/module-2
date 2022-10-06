package case_study.service.impl;

import case_study.model.human.Employee;
import case_study.model.rental_facility.Facility;
import case_study.model.rental_service.Booking;
import case_study.service.IBookingService;
import case_study.utils.booking_comparator.BookingComparator;
import case_study.utils.unique_properties.UniqueProperties;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static case_study.service.impl.FacilityService.*;

public class BookingService implements IBookingService {
    public Scanner input = new Scanner(System.in);
    public SortedSet<Booking> bookingSet = new TreeSet<>(new BookingComparator());


    public Booking getBookingInfo() {
        System.out.print("Input Booking Code: ");
        String bookingCode = input.nextLine();
        System.out.print("Input Booking Start Date (Format: dd/MM/yyyy): ");
        LocalDate startDate = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Input Booking End Date (Format: dd/MM/yyyy): ");
        LocalDate endDate = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("-Customer List-");
        for (int i = 0; i < CustomerService.customerList.size(); i++) {
            System.out.println(CustomerService.customerList.get(i).toString());
        }
        System.out.print("Input Booking Customer Code: ");
        String bookingCustomerCode = input.nextLine();
        System.out.println("-Service List-");
        Set<Facility> keys = facilityMap.keySet();
        if (!keys.isEmpty()) {
            for (Facility key : keys) {
                System.out.println(key.toString());

            }
        } else {
            System.out.println("There is no Facility in list!");
        }
        System.out.print("Input Service Code: ");
        String serviceCode = input.nextLine();
        System.out.print("Input Service Type: ");
        String serviceType = input.nextLine();
        return new Booking(bookingCode, startDate, endDate, bookingCustomerCode, serviceCode, serviceType);
    }


    @Override
    public void addNew() {

    }

    @Override
    public void displayList() {
        try {
            bookingSet = readFileBooking();
        } catch (IOException | ArrayIndexOutOfBoundsException exception) {
            System.out.println("Data is Empty!");
        }
        if (bookingSet.size() != 0) {
            for (Booking booking : bookingSet) {
                System.out.println(booking.toString());
            }
        } else {
            System.out.println("There is no Booking in list!");
        }
    }


    @Override
    public void addNewBooking() throws IOException {
        try {
            bookingSet = readFileBooking();
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            System.out.println("Data is Empty");
        }
        Booking booking = this.getBookingInfo();
        Set<Facility> keys = facilityMap.keySet();
        for (Facility facility : keys) {
            if (facility.getServiceCode().equals(booking.getServiceCode())) {
                facilityMap.replace(facility, facilityMap.get(facility) + 1);
            }
        }
        bookingSet.add(booking);
        writeFileBooking(bookingSet);
        addFacilityMaintenance();
        System.out.println("Added new Order");
    }


    private String bookingFileForm(Booking booking) {
        return booking.getBookingCode() + "," + booking.getStartDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "," + booking.getEndDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    private void writeFileBooking(SortedSet<Booking> bookingSet) throws IOException {
        File file = new File("src\\case_study\\data\\booking.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (Booking booking : bookingSet) {
            bufferedWriter.write(bookingFileForm(booking));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
    //    private String bookingCode;
//    private LocalDate startDate;
//    private LocalDate endDate;
//    private String bookingCustomerCode;
//    private String serviceCode;
//    private String serviceType;

    private SortedSet<Booking> readFileBooking() throws IOException {
        File file = new File("src\\case_study\\data\\booking.csv");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        SortedSet<Booking> bookingSet = new TreeSet<>(new BookingComparator());
        String line;
        String[] properties;
        Booking booking;
        while ((line = bufferedReader.readLine()) != null) {
            properties = line.split(",");
            booking = new Booking(properties[0], LocalDate.parse(properties[1],
                    DateTimeFormatter.ofPattern("dd/MM/yyyy")), LocalDate.parse(properties[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    properties[3], properties[4], properties[5]);

            bookingSet.add(booking);
        }
        bufferedReader.close();
        return bookingSet;
    }
}
