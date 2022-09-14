package ss7_abstract_class_and_interface.practice.develope_interface_comparable_for_geometric_classes;

import ss6_inheritance.practice.shape_objects.Circle.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {   //generic
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

        public ComparableCircle(String color, boolean filled, double radius) {
            super(color,  filled, radius);
        }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
