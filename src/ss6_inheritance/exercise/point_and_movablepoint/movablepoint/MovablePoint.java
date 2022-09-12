package ss6_inheritance.exercise.point_and_movablepoint.movablepoint;

import ss6_inheritance.exercise.point_and_movablepoint.point.Point;

import java.util.Arrays;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{getXSpeed(),getYSpeed()};
    }

    public MovablePoint() {
    }

    public String toString(){
        return super.toString() + " Quãng đường di chuyển: " + Arrays.toString(getSpeed());
    }

    public float[] move(){
        return new float[]{super.getX()+getXSpeed(), super.getY()+getYSpeed()};
    }

}
