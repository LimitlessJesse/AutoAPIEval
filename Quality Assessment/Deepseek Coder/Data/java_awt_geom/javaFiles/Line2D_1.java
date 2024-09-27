import java.awt.geom.Line2D;

public class Line2D_1 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(1, 2, 3, 4);
        double x1 = line.getX1();
        System.out.println("The x-coordinate of the first point is: " + x1);
    }
}
