import java.awt.geom.Line2D;

public class Line2D_Double_3 {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(0, 0, 10, 10);
        double x2 = line.getX2();
        System.out.println("X coordinate of the end point: " + x2);
    }
}
