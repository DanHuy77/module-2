package extra_exercise.member_list.model;

public class Teacher extends Person {
    private String specialization;


    public Teacher() {
    }

    public Teacher(String specialization) {
        this.specialization = specialization;
    }

    public Teacher(String code, String name, String birthday, String gender, String specialization) {
        super(code, name, birthday, gender);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + "Job: Teacher, " +
                "specialization='" + specialization + '\'';
    }
}
