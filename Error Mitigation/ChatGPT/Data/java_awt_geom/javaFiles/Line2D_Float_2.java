import java.awt.geom.Line2D;

public class Line2D_Float_2 {
    public static void main(String[] args) {
        Line2D.Float line = new Line2D.Float(1.0f, 2.0f, 3.0f, 4.0f);
        double startY = line.getY1();
        System.out.println("Start Y coordinate: " + startY);
    }
}
