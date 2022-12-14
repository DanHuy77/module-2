package ss6_inheritance.exercise.point2D_and_point3D.point3D;

import ss6_inheritance.exercise.point2D_and_point3D.point2D.Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), getZ()};
    }


    public String toString(){
        return String.format("(%.2f,%2f,%2f)",getX(),getY(),getZ());
    }
}
