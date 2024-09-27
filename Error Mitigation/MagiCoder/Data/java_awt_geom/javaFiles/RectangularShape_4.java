import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

public class RectangularShape_4 {
    public static void main(String[] args) {
        RectangularShape rect = new RectangularShape() {
            @Override
            public RectangularShape createTransformedShape(AffineTransform tx) {
                return null;
            }

            @Override
            public boolean contains(double x, double y) {
                return false;
            }

            @Override
            public boolean contains(double x, double y, double w, double h) {
                return false;
            }

            @Override
            public boolean contains(Point2D p) {
                return false;
            }

            @Override
            public boolean contains(Rectangle2D r) {
                return false;
            }

            @Override
            public Rectangle2D getBounds2D() {
                return null;
            }

            @Override
            public double getHeight() {
                return 0;
            }

            @Override
            public double getMaxX() {
                return 0;
            }

            @Override
            public double getMaxY() {
                return 0;
            }

            @Override
            public double getMinX() {
                return 0;
            }

            @Override
            public double getMinY() {
                return 0;
            }

            @Override
            public double getWidth() {
                return 0;
            }

            @Override
            public boolean intersects(double x, double y, double w, double h) {
                return false;
            }

            @Override
            public boolean intersects(Rectangle2D r) {
                return false;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public void setFrame(double x, double y, double w, double h) {

            }
        };

        Point2D p = new Point2D.Double(10, 10);
        boolean result = rect.contains(p);
        System.out.println(result);
    }
}
