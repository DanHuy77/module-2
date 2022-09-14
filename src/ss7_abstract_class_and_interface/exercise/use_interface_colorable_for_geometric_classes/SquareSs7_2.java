package ss7_abstract_class_and_interface.exercise.use_interface_colorable_for_geometric_classes;

public class SquareSs7_2 extends Geometric implements Colorable {
private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public SquareSs7_2(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return Math.pow(getSize(),2);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
