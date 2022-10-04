package case_study.service;

public interface IEmployeeService extends IService {
    @Override
    void displayList();

    @Override
    void addNew();


    void editByID();


}
