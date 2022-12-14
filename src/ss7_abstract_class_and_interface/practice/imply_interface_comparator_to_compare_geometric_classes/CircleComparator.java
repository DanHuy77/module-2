package ss7_abstract_class_and_interface.practice.imply_interface_comparator_to_compare_geometric_classes;

import ss6_inheritance.practice.shape_objects.Circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

}
