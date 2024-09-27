import java.awt.geom.Line2D;

public class Line2D_Double_4 {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        double x2 = line.getX2();
        System.out.println("X2: " + x2);
    }
}
