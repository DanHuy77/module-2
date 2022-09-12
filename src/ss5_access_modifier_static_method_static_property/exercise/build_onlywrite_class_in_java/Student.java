package ss5_access_modifier_static_method_static_property.exercise.build_onlywrite_class_in_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Tên " + name);
    }
    public void setClasses(String classes){
        this.classes = classes;
        System.out.println("Lớp " + classes);
    }
}
