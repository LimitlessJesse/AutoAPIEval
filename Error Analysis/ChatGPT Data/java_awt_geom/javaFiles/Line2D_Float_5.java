import java.awt.geom.Line2D;

public class Line2D_Float_5 {
    public static void main(String[] args) {
        Line2D.Float line = new Line2D.Float();
        line.setLine(0.0f, 0.0f, 100.0f, 100.0f);
        System.out.println("Line coordinates: (" + line.x1 + ", " + line.y1 + "), (" + line.x2 + ", " + line.y2 + ")");
    }
}
