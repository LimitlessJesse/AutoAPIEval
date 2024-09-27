import java.awt.geom.Arc2D;
import java.awt.geom.Arc2D.Double;

public class Arc2D_Double_1 {
    public static void main(String[] args) {
        Double arc = new Double();
        arc.setFrame(10, 10, 100, 100);
        arc.setAngleStart(45);
        arc.setAngleExtent(90);
        
        double x = arc.getX();
        System.out.println("The x-coordinate of the arc is: " + x);
    }
}
