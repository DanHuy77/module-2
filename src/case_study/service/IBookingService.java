package case_study.service;

public interface IBookingService extends IService {
    @Override
    void addNew();

    @Override
    void displayList();


    void addNewBooking();
}
