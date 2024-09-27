import java.awt.geom.Line2D;

public class Line2D_4 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        double y2 = line.getY2();
        System.out.println("Y coordinate of the end point: " + y2);
    }
}
