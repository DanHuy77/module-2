package ss5_access_modifier_static_method_static_property.practice.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "DDBIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "Codegym";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

