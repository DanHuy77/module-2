package case_study.service;

public interface ICustomerService extends IService {
    @Override
    void displayList();

    @Override
    void addNew();


    void editByID();

}
