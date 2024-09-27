import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;

public class Arc2D_Double_2 {
    public static void main(String[] args) {
        Double arc = new Double();
        arc.setFrame(0, 0, 100, 100);
        arc.setAngleStart(45);
        arc.setAngleExtent(90);

        double y = arc.getY();
        System.out.println("The y-coordinate of the arc's frame is: " + y);
    }
}
