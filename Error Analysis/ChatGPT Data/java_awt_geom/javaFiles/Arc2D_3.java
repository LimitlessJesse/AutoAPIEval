import java.awt.geom.Arc2D;

public class Arc2D_3 {
    public static void main(String[] args) {
        Arc2D arc = new Arc2D.Double(0, 0, 100, 100, 0, 90, Arc2D.OPEN);
        int arcType = arc.getArcType();
        System.out.println("Arc Type: " + arcType);
    }
}
