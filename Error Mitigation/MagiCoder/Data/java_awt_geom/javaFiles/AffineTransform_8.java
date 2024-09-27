import java.awt.geom.AffineTransform;

public class AffineTransform_8 {
    public static void main(String[] args) {
        AffineTransform at1 = new AffineTransform();
        at1.setTransform(1, 0, 0, 1, 10, 10);

        AffineTransform at2 = new AffineTransform();
        at2.setTransform(at1);

        System.out.println("at1: " + at1);
        System.out.println("at2: " + at2);
    }
}
