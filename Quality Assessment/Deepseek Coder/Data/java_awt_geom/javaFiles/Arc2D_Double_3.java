import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;

public class Arc2D_Double_3 {
    public static void main(String[] args) {
        Double arc = new Double();
        arc.setFrame(0, 0, 100, 100);
        arc.setAngleStart(45);
        arc.setAngleExtent(90);
        double width = arc.getWidth();
        System.out.println("Width of the arc: " + width);
    }
}
