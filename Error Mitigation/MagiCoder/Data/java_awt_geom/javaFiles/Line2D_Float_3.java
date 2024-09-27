import java.awt.geom.Line2D;

public class Line2D_Float_3 {
    public static void main(String[] args) {
        Line2D.Float line = new Line2D.Float(1.0f, 2.0f, 3.0f, 4.0f);
        double x1 = line.getX1();
        System.out.println("X1: " + x1);
    }
}
