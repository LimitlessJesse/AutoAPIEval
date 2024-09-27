import java.awt.geom.Path2D;

public class Path2D_Double_1 {
    public static void main(String[] args) {
        Path2D.Double path = new Path2D.Double();
        path.moveTo(10.0, 20.0);
        path.moveTo(30.0, 40.0);
        System.out.println(path.getCurrentPoint()); // Output: java.awt.geom.Point2D$Double[x=30.0,y=40.0]
    }
}
