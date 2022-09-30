package extra_exercise.member_list.service;

import extra_exercise.member_list.model.Teacher;

import java.io.IOException;

public interface IMemberService {
    void addMember() throws IOException;

    void removeMember() throws IOException;

    void displayList() throws IOException;

    boolean searchByName(String name) throws IOException;

    boolean searchByCode(String code) throws IOException;

    void sortByNameOrID() throws IOException;

}
