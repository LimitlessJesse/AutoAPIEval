import java.awt.geom.Line2D;

public class Line2D_5 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double();
        line.setLine(10, 20, 30, 40);
        System.out.println("Line: " + line);
    }
}
