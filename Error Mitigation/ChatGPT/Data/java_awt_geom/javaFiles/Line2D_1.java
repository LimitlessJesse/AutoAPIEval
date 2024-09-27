import java.awt.geom.Line2D;

public class Line2D_1 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        double x1 = line.getX1();
        System.out.println("X coordinate of the start point: " + x1);
    }
}
