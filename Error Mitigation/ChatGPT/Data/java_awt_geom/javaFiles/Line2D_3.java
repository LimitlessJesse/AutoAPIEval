import java.awt.geom.Line2D;

public class Line2D_3 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        double x2 = line.getX2();
        System.out.println("X coordinate of end point: " + x2);
    }
}
