import java.awt.geom.Dimension2D;

public class Dimension2D_2 {
    public static void main(String[] args) {
        Dimension2D dimension = new Dimension2D() {
            @Override
            public double getWidth() {
                return 0;
            }

            @Override
            public double getHeight() {
                return 10.5;
            }
        };

        System.out.println("Height: " + dimension.getHeight());
    }
}
