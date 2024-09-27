import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Float_4 {
    public static void main(String[] args) {
        CubicCurve2D.Float curve = new CubicCurve2D.Float(10.0f, 20.0f, 30.0f, 40.0f, 50.0f, 60.0f, 70.0f, 80.0f);
        
        // Getting the control point 1
        Point2D ctrlP1 = curve.getCtrlP1();
        
        System.out.println("Control Point 1: " + ctrlP1.toString());
    }
}
