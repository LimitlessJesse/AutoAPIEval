import java.awt.geom.Line2D;

public class Line2D_2 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(0, 0, 10, 10);
        double y1 = line.getY1();
        System.out.println("Y coordinate of the start point: " + y1);
    }
}
