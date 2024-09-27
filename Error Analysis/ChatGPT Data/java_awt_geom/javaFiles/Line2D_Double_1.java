import java.awt.geom.Line2D;

public class Line2D_Double_1 {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(0, 0, 10, 10);
        java.awt.geom.Point2D p1 = line.getP1();
        System.out.println("Point 1 coordinates: (" + p1.getX() + ", " + p1.getY() + ")");
    }
}
