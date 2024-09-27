import java.awt.geom.CubicCurve2D;

public class CubicCurve2D_Double_3 {
    public static void main(String[] args) {
        CubicCurve2D.Double cubicCurve = new CubicCurve2D.Double(0, 0, 50, 50, 100, 0, 150, 50); // Example cubic curve
        
        System.out.println("Control point 2: " + cubicCurve.getCtrlP2());
    }
}
