import java.awt.geom.Line2D;

public class Line2D_Double_5 {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double();
        line.setLine(0.0, 0.0, 10.0, 10.0);
        System.out.println("Line coordinates: (" + line.getX1() + ", " + line.getY1() + "), (" + line.getX2() + ", " + line.getY2() + ")");
    }
}
