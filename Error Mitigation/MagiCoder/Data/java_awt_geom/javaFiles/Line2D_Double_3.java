import java.awt.geom.Line2D;

public class Line2D_Double_3 {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        double y1 = line.getY1();
        System.out.println("Y coordinate of the start point: " + y1);
    }
}
