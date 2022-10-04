package case_study.service;

public interface IContractService extends IService {
    @Override
    void displayList();

    @Override
    void addNew();

    void createNewContract();

    void edit();
}
