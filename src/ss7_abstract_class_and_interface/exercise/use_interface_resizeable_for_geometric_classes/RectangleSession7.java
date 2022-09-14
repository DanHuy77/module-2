package ss7_abstract_class_and_interface.exercise.use_interface_resizeable_for_geometric_classes;

public class RectangleSession7 implements Resizeable {
    private double rectangleSize;

    public double getRectangleSize() {
        return rectangleSize;
    }

    public void setRectangleSize(double size) {
        this.rectangleSize = size;
    }

    @Override
    public void increaseSize(double percent) {
        setRectangleSize(getRectangleSize() +  (getRectangleSize() * percent) /100);
    }
}
