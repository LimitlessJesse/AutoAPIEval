import java.awt.geom.Arc2D;

public class Arc2D_Double_5 {
    public static void main(String[] args) {
        Arc2D.Double arc = new Arc2D.Double();
        arc.setArc(100.0, 100.0, 200.0, 150.0, 45.0, 90.0, Arc2D.OPEN);
        System.out.println("Arc X: " + arc.getX());
        System.out.println("Arc Y: " + arc.getY());
        System.out.println("Arc Width: " + arc.getWidth());
        System.out.println("Arc Height: " + arc.getHeight());
        System.out.println("Start Angle: " + arc.getAngleStart());
        System.out.println("Extent: " + arc.getAngleExtent());
        System.out.println("Arc Type: " + arc.getArcType());
    }
}
