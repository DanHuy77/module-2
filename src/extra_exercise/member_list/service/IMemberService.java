package extra_exercise.member_list.service;

import extra_exercise.member_list.model.Teacher;

public interface IMemberService {
    void addMember();

    void removeMember();

    void displayList();

    boolean searchByName(String name);

    boolean searchByCode(String code);

    void sortByNameOrID();

}
