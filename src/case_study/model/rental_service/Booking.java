package case_study.model.rental_service;

import java.time.LocalDate;

public class Booking {
    private String bookingCode;
    private LocalDate startDate;
    private LocalDate endDate;
    private String bookingCustomerCode;
    private String serviceCode;
    private String serviceType;

    public Booking() {
    }

    public Booking(String bookingCode, LocalDate startDate, LocalDate endDate, String bookingCustomerCode, String serviceCode, String serviceType) {
        this.bookingCode = bookingCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookingCustomerCode = bookingCustomerCode;
        this.serviceCode = serviceCode;
        this.serviceType = serviceType;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getBookingCustomerCode() {
        return bookingCustomerCode;
    }

    public void setBookingCustomerCode(String bookingCustomerCode) {
        this.bookingCustomerCode = bookingCustomerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "BookingService{" +
                "bookingCode='" + bookingCode + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", bookingCustomerCode='" + bookingCustomerCode + '\'' +
                ", serviceName='" + serviceCode + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}
