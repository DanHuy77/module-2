package case_study.service;

import case_study.utils.exception.CaseStudyFormatException;

import java.io.IOException;

public interface ICustomerService extends IService {
    @Override
    void displayList() throws IOException;

    @Override
    void addNew() throws IOException, CaseStudyFormatException;


    void editByID() throws IOException;

}
