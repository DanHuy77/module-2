package case_study.service;

public interface IFacilityService extends IService {
    @Override
    void displayList();

    @Override
    void addNew();


    void edit();
}
