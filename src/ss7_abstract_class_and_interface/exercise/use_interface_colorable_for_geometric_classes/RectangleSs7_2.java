package ss7_abstract_class_and_interface.exercise.use_interface_colorable_for_geometric_classes;

public class RectangleSs7_2 extends Geometric {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public RectangleSs7_2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    @Override
    public String toString() {
        return "RectangleSs7_2{" + "Area = " + getArea() + '}';
    }
}
