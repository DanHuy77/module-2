package ss7_abstract_class_and_interface.exercise.use_interface_resizeable_for_geometric_classes;


public class InterfaceResizeableTest {
    public static void main(String[] args) {

        Resizeable[] resizeable = new Resizeable[3];
        resizeable[0] = new CircleSession7();
        resizeable[1] = new RectangleSession7();
        resizeable[2] = new SquareSession7();
        double size;
        for (Resizeable resizeableElement : resizeable) {
            size = 1 + Math.random() * 99;
            if (resizeableElement instanceof CircleSession7) {
                System.out.println("Hình Tròn" );
                ((CircleSession7) resizeableElement).setCircleSize(1.0);
                System.out.println("Kích thước ban đầu: " + ((CircleSession7) resizeableElement).getCircleSize());

                resizeableElement.increaseSize(size);

                System.out.println("Số % tăng lên: " + size);
                System.out.println("Kích thước sau khi tăng: "  + ((CircleSession7) resizeableElement).getCircleSize()+ "\n");


            } else if (resizeableElement instanceof RectangleSession7) {
                System.out.println("Hình chữ nhật" );
                ((RectangleSession7) resizeableElement).setRectangleSize(1.0);
                System.out.println("Kích thước ban đầu: " + ((RectangleSession7) resizeableElement).getRectangleSize());

                resizeableElement.increaseSize(size);

                System.out.println("Số % tăng lên: " + size);
                System.out.println("Kích thước sau khi tăng: "  + ((RectangleSession7) resizeableElement).getRectangleSize()+ "\n");

            } else if (resizeableElement instanceof SquareSession7) {
                System.out.println("Hình vuông" );
                ((SquareSession7) resizeableElement).setSquareSize(1.0);
                System.out.println("Kích thước ban đầu: " + ((SquareSession7) resizeableElement).getSquareSize());

                resizeableElement.increaseSize(size);

                System.out.println("Số % tăng lên: " + size);
                System.out.println("Kích thước sau khi tăng: "  + ((SquareSession7) resizeableElement).getSquareSize() + "\n");
            }
        }
    }

}
