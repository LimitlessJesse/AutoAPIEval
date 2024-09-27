import java.awt.geom.Line2D;

public class Line2D_Float_3 {
    public static void main(String[] args) {
        Line2D.Float line = new Line2D.Float(0, 0, 10, 10);
        double x2 = line.getX2();
        System.out.println("X coordinate of end point: " + x2);
    }
}
