import java.awt.geom.Dimension2D;

public class Dimension2D_1 {
    public static void main(String[] args) {
        Dimension2D dimension = new Dimension2D() {
            @Override
            public double getWidth() {
                return 10.5; // Example width value
            }

            @Override
            public double getHeight() {
                return 5.3; // Example height value
            }

            @Override
            public void setSize(double width, double height) {
                // Not implemented for this example
            }
        };

        System.out.println("Width: " + dimension.getWidth());
    }
}
