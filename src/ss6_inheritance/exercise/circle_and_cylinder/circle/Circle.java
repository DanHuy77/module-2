package ss6_inheritance.exercise.circle_and_cylinder.circle;

public class Circle {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }
    public Circle(){

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(getRadius(),2)*Math.PI;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        return "Hình tròn có bán kính là: " + getRadius() + " với màu sắc: " + getColor() +
                " và diện tích là: " + getArea();
    }
}
