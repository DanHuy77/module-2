package case_study.service;

import case_study.utils.exception.CaseStudyFormatException;

import java.io.IOException;

public interface IService {
    void displayList() throws IOException;

    void addNew() throws IOException, CaseStudyFormatException;


}
