package case_study.service;

import java.io.IOException;

public interface IEmployeeService extends IService {
    @Override
    void displayList() throws IOException;

    @Override
    void addNew() throws IOException;


    void editByID() throws IOException;


}
