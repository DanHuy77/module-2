package ss7_abstract_class_and_interface.exercise.use_interface_colorable_for_geometric_classes;

public class SquareSs7_2 extends Geometric implements Colorable {
private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public SquareSs7_2(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(),2);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
