import java.awt.geom.FlatteningPathIterator;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;

public class FlatteningPathIterator_2 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.lineTo(30, 10);
        path.closePath();

        FlatteningPathIterator iterator = new FlatteningPathIterator(path.getPathIterator(null));

        while (!iterator.isDone()) {
            float[] coords = new float[6];
            int type = iterator.currentSegment(coords);

            switch (type) {
                case FlatteningPathIterator.SEG_MOVETO:
                    System.out.println("MoveTo: (" + coords[0] + ", " + coords[1] + ")");
                    break;
                case FlatteningPathIterator.SEG_LINETO:
                    System.out.println("LineTo: (" + coords[0] + ", " + coords[1] + ")");
                    break;
                case FlatteningPathIterator.SEG_QUADTO:
                    System.out.println("QuadTo: (" + coords[0] + ", " + coords[1] + ")");
                    break;
                case FlatteningPathIterator.SEG_CUBICTO:
                    System.out.println("CubicTo: (" + coords[0] + ", " + coords[1] + ")");
                    break;
                case FlatteningPathIterator.SEG_CLOSE:
                    System.out.println("Close");
                    break;
            }

            iterator.next();
        }
    }
}
