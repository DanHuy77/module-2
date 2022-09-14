package ss7_abstract_class_and_interface.exercise.use_interface_resizeable_for_geometric_classes;

public class CircleSession7 implements Resizeable {
    public double getCircleSize() {
        return circleSize;
    }

    public void setCircleSize(double circleSize) {
        this.circleSize = circleSize;
    }

    private double circleSize;


    @Override
    public void increaseSize(double percent) {
        setCircleSize(getCircleSize() + (getCircleSize() * percent) / 100);
    }
}
