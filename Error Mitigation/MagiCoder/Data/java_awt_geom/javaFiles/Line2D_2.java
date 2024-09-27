import java.awt.geom.Line2D;

public class Line2D_2 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        double x1 = line.getX1();
        System.out.println("X1: " + x1);
    }
}
