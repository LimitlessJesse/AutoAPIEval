import java.awt.geom.Line2D;

public class Line2D_Float_1 {
    public static void main(String[] args) {
        Line2D.Float line = new Line2D.Float(10.0f, 20.0f, 30.0f, 40.0f);
        double x1 = line.getX1();
        System.out.println("X coordinate of the start point: " + x1);
    }
}
