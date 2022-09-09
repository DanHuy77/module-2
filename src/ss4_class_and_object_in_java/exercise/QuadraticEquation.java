package ss4_class_and_object_in_java.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {

        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {

        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị a");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Nhập giá trị b");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Nhập giá trị c");
        double c = Double.parseDouble(input.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double delta = quadraticEquation.getDiscriminant();
        double r;
        double r1;
        double r2;
        if (delta > 0) {
            r1 = quadraticEquation.getRoot1();
            System.out.println("Nghiệm thứ nhất của phương trình: " + r1);

            r2 = quadraticEquation.getRoot2();
            System.out.println("Nghiệm thứ hai của phương trình: " + r2);
        } else if (delta == 0) {
            r = quadraticEquation.getRoot1();
            System.out.println("Phương trình có 1 nghiệm: " + r);
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
