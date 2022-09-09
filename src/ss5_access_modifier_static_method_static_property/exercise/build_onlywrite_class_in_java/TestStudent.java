package ss5_access_modifier_static_method_static_property.exercise.build_onlywrite_class_in_java;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        st1.setName("AA");
        st1.setClasses("C01");

        st2.setName("BB");
        st2.setClasses("C01");
    }
}
