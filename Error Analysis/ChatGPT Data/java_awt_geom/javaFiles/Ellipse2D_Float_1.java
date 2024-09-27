import java.awt.geom.Ellipse2D;

public class Ellipse2D_Float_1 {
    public static void main(String[] args) {
        Ellipse2D.Float ellipse = new Ellipse2D.Float();
        ellipse.setFrame(10.0f, 10.0f, 100.0f, 50.0f);
        System.out.println("Ellipse Frame: " + ellipse);
    }
}
