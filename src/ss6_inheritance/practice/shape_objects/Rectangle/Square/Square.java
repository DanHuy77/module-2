package ss6_inheritance.practice.shape_objects.Rectangle.Square;

import ss6_inheritance.practice.shape_objects.Rectangle.Rectangle;

public class Square extends Rectangle {
    private double side;

    Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    public String toString() {
        return "A Square with side = " + getSide() + " , which is a subclass of " + super.toString();
    }
}
