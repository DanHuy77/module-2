package ss7_abstract_class_and_interface.exercise.use_interface_colorable_for_geometric_classes;

public class CircleSs7_2 extends Geometric {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public CircleSs7_2(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
       return Math.PI * Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "CircleSs7_2{" +
                "Area = " + getArea() +
                '}';
    }
}
