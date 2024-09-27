import java.awt.geom.Dimension2D;

public class Dimension2D_4 {
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
                // Set the size of the Dimension2D object
            }
        };

        Dimension2D newDimension = new Dimension2D() {
            @Override
            public double getWidth() {
                return 10;
            }

            @Override
            public double getHeight() {
                return 20;
            }

            @Override
            public void setSize(double width, double height) {
                // Set the size of the Dimension2D object
            }
        };

        System.out.println("Before setting size: Width = " + dimension.getWidth() + ", Height = " + dimension.getHeight());
        dimension.setSize(newDimension);
        System.out.println("After setting size: Width = " + dimension.getWidth() + ", Height = " + dimension.getHeight());
    }
}
