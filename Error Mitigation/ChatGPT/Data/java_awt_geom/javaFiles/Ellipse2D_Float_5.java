import java.awt.geom.Ellipse2D;

public class Ellipse2D_Float_5 {
    public static void main(String[] args) {
        Ellipse2D.Float ellipse = new Ellipse2D.Float();
        ellipse.setFrame(10.0, 10.0, 100.0, 50.0);
        System.out.println("Ellipse X: " + ellipse.getX());
        System.out.println("Ellipse Y: " + ellipse.getY());
        System.out.println("Ellipse Width: " + ellipse.getWidth());
        System.out.println("Ellipse Height: " + ellipse.getHeight());
    }
}
