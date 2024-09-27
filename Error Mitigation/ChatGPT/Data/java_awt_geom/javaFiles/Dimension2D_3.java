import java.awt.geom.Dimension2D;

public class Dimension2D_3 {
    public static void main(String[] args) {
        Dimension2D dimension = new Dimension2D() {
            @Override
            public double getWidth() {
                return 0;
            }

            @Override
            public double getHeight() {
                return 0;
            }

            @Override
            public void setSize(double width, double height) {
                System.out.println("Setting size to width: " + width + ", height: " + height);
            }
        };

        dimension.setSize(10.0, 20.0);
    }
}
