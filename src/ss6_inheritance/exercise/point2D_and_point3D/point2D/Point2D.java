package ss6_inheritance.exercise.point2D_and_point3D.point2D;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public Point2D(float x, float y) {
        setX(x);
        setY(y);
    }

    public String toString() {

        return "Điểm có tọa độ là: " + String.format("(%.2f,%.2f)",getX(), getY());
    }

}
