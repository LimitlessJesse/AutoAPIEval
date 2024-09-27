import java.awt.geom.Line2D;

public class Line2D_2 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double(1, 2, 3, 4);
        double y1 = line.getY1();
        System.out.println("The y-coordinate of the first point is: " + y1);
    }
}
