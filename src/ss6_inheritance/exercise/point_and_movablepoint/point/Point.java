package ss6_inheritance.exercise.point_and_movablepoint.point;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

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

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return new float[] {getX(), getY()};
    }

    public String toString(){
        return "Địa điểm có tọa độ: " + Arrays.toString(getXY());
    }
}
