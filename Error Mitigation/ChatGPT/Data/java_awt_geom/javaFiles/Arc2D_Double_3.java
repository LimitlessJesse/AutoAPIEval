import java.awt.geom.Arc2D;

public class Arc2D_Double_3 {
    public static void main(String[] args) {
        Arc2D.Double arc = new Arc2D.Double(10.0, 20.0, 30.0, 40.0, 45.0, 90.0, Arc2D.OPEN);
        double height = arc.getHeight();
        System.out.println("Height of the framing rectangle: " + height);
    }
}
