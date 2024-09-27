import java.awt.geom.Point2D;

public class QuadCurve2D_Double_2 {
    public static void main(String[] args) {
        // Create a QuadCurve2D.Double object
        QuadCurve2D.Double curve = new QuadCurve2D.Double(10, 10, 50, 80, 90, 10);
        
        // Get the control point of the quadratic curve
        Point2D controlPoint = curve.getCtrlPt();
        
        // Print out the x and y coordinates of the control point
        System.out.println("Control Point X: " + controlPoint.getX());
        System.out.println("Control Point Y: " + controlPoint.getY());
    }
}
