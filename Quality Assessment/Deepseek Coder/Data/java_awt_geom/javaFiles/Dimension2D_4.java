import java.awt.geom.Dimension2D;
import java.awt.geom.Rectangle2D;

public class Dimension2D_4 {
    public static void main(String[] args) {
        Rectangle2D rect = new Rectangle2D.Double();
        Dimension2D dim = new Dimension2D() {
            double width = 100;
            double height = 200;

            @Override
            public double getWidth() {
                return width;
            }

            @Override
            public double getHeight() {
                return height;
            }

            @Override
            public void setSize(double width, double height) {
                this.width = width;
                this.height = height;
            }
        };

        rect.setFrame(0, 0, dim.getWidth(), dim.getHeight());

        System.out.println("Rectangle: " + rect);
    }
}
