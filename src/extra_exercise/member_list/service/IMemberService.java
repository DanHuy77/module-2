package extra_exercise.member_list.service;

public interface IMemberService {
    void addMember();

    void removeMember();

    void displayList();

    boolean searchByName(String name);

    boolean searchByID(int ID);

}
