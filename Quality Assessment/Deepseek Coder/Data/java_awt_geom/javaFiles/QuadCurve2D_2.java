import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_2 {
    public static void main(String[] args) {
        QuadCurve2D q = new QuadCurve2D.Float();
        q.setCurve(1, 2, 3, 4, 5, 6);
        System.out.println(q.getCtrlX1());
    }
}
