package ss7_abstract_class_and_interface.exercise.use_interface_resizeable_for_geometric_classes;

import ss7_abstract_class_and_interface.exercise.use_interface_colorable_for_geometric_classes.Colorable;

public class SquareSession7 implements Resizeable {
    private double squareSize;

    public double getSquareSize() {
        return squareSize;
    }

    public void setSquareSize(double squareSize) {
        this.squareSize = squareSize;
    }

    @Override
    public void increaseSize(double percent) {

        setSquareSize(getSquareSize() + (getSquareSize() * percent) /100);
    }

}
