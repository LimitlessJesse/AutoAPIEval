import java.awt.geom.Dimension2D;

public class Dimension2D_1 {
    public static void main(String[] args) {
        Dimension2D dimension = new Dimension2D() {
            @Override
            public double getWidth() {
                return 10.0;
            }

            @Override
            public double getHeight() {
                return 5.0;
            }

            @Override
            public void setSize(double width, double height) {
                // Not implemented in this example
            }
        };

        double width = dimension.getWidth();
        System.out.println("Width: " + width);
    }
}
