package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        System.out.println("Bán kính " + c1.getRadius());
        System.out.println("Diện tích " + c1.getArea());
    }
}
