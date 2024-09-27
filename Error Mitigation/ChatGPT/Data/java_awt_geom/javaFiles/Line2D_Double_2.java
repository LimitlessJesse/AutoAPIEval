import java.awt.geom.Line2D;

public class Line2D_Double_2 {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(1.0, 2.0, 3.0, 4.0);
        double startY = line.getY1();
        System.out.println("Start Y coordinate: " + startY);
    }
}
