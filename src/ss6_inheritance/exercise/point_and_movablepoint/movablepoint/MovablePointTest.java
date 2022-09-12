package ss6_inheritance.exercise.point_and_movablepoint.movablepoint;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        System.out.println(movablePoint.toString());
        System.out.println(Arrays.toString(movablePoint.move()));
    }
}
