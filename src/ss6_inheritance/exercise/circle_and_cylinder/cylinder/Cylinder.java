package ss6_inheritance.exercise.circle_and_cylinder.cylinder;

import ss6_inheritance.exercise.circle_and_cylinder.circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Hình trụ{" +
                "chiều cao = " + height + " thể tích = "  + getVolume() + " Mặt đáy " + super.toString() +
                '}';
    }
}
