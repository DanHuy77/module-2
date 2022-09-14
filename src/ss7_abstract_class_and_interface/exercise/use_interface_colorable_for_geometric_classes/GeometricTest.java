package ss7_abstract_class_and_interface.exercise.use_interface_colorable_for_geometric_classes;


public class GeometricTest {
    public static void main(String[] args) {
        Geometric[] geometrics = new Geometric[4];
        geometrics[0] = new CircleSs7_2(2);
        geometrics[1] = new RectangleSs7_2(2, 4);
        geometrics[2] = new SquareSs7_2(4);
        geometrics[3] = new SquareSs7_2(6);

        for (Geometric geometric : geometrics) {
            if (geometric instanceof CircleSs7_2) {
                System.out.println("Diện tích hình tròn " + geometric.getArea() + "\n");
            } else if (geometric instanceof RectangleSs7_2) {
                System.out.println("Diện tích hình chữ nhật " + geometric.getArea() + "\n");
            } else if (geometric instanceof SquareSs7_2) {
                System.out.println("Diện tích hình vuông " + geometric.getArea());
                ((SquareSs7_2) geometric).howToColor();
                System.out.println("\n");

            }
        }
    }
}
