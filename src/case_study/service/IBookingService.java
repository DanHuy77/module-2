package case_study.service;

import java.io.IOException;

public interface IBookingService extends IService {
    @Override
    void addNew();

    @Override
    void displayList();


    void addNewBooking() throws IOException;
}
