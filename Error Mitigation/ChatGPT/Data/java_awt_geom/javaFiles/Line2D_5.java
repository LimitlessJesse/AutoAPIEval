import java.awt.geom.Line2D;

public class Line2D_5 {
    public static void main(String[] args) {
        Line2D line = new Line2D.Double();
        line.setLine(0, 0, 100, 100);
        System.out.println("Start point: (" + line.getX1() + ", " + line.getY1() + ")");
        System.out.println("End point: (" + line.getX2() + ", " + line.getY2() + ")");
    }
}
