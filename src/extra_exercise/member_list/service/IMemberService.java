package extra_exercise.member_list.service;

import extra_exercise.member_list.model.Teacher;

import java.io.IOException;

public interface IMemberService {
    void addMember() throws IOException;

    void removeMember() throws IOException;

    void displayList();

    boolean searchByName(String name);

    boolean searchByCode(String code);

    void sortByNameOrID();

}
