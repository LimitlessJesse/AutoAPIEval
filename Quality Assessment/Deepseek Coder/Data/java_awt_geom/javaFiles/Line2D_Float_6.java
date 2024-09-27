import java.awt.geom.Line2D;

public class Line2D_Float_6 {
    public static void main(String[] args) {
        Line2D.Float line = new Line2D.Float();
        line.setLine(10, 20, 30, 40);
        System.out.println("Line: (" + line.x1 + ", " + line.y1 + "), (" + line.x2 + ", " + line.y2 + ")");
    }
}
