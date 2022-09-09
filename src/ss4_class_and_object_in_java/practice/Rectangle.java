package ss4_class_and_object_in_java.practice;


import java.util.Scanner;

public class Rectangle {

    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPeri() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Hình chữ nhật có chiều rộng " + this.width + " và chiều cao " + this.height;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều rộng");
        double width = Double.parseDouble(input.nextLine());
        System.out.println("Nhập chiều cao");
        double height = Double.parseDouble(input.nextLine());
        Rectangle rec = new Rectangle(width, height);

        System.out.println("Thông tin hình chữ nhật " + rec.display());
        System.out.println("Diện tích hình chữ nhật " + rec.getArea());
        System.out.println("Chu vi hình chữ nhật " + rec.getPeri());
    }
}

