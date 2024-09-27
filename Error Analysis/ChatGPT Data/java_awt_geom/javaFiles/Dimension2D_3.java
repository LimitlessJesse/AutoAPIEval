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
                // Implement setSize method
            }
        };

        dimension.setSize(10.0, 20.0);
        System.out.println("Width: " + dimension.getWidth());
        System.out.println("Height: " + dimension.getHeight());
    }
}
