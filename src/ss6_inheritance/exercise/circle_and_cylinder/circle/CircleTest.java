package ss6_inheritance.exercise.circle_and_cylinder.circle;

import ss6_inheritance.exercise.circle_and_cylinder.circle.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "Red");
        circle.getArea();
        System.out.println(circle.toString());
    }
}
