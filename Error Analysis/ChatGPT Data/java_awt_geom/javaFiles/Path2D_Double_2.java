import java.awt.geom.Path2D;

public class Path2D_Double_2 {
    public static void main(String[] args) {
        Path2D.Double path = new Path2D.Double();
        path.moveTo(0, 0);
        path.lineTo(100, 100);
        path.lineTo(200, 100);
        path.lineTo(200, 200);
        System.out.println(path.getPathIterator(null).currentSegment(new double[6])); //This will print the segment type (eg. SEG_LINETO)
    }
}
