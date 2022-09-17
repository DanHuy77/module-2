package extra_exercise.member_list.model;

public class Student extends Person {
    private String className;
    private double point;

    public Student() {
    }

    public Student(String className, double point) {
        this.className = className;
        this.point = point;
    }

    public Student(String code, String name, String birthday, String gender, String className, double point) {
        super(code, name, birthday, gender);
        this.className = className;
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString() + "Job: Student, " +
                "className='" + className + '\'' +
                ", point=" + point;
    }
}
