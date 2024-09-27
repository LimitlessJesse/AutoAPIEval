import java.awt.geom.Arc2D;

public class Arc2D_Double_3 {
    public static void main(String[] args) {
        Arc2D.Double arc = new Arc2D.Double(10, 10, 100, 100, 90, 180, Arc2D.OPEN);
        double height = arc.getHeight();
        System.out.println("Height of the arc: " + height);
    }
}
