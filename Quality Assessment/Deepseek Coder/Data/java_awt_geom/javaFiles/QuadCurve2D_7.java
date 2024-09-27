import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_7 {
    public static void main(String[] args) {
        QuadCurve2D q = new QuadCurve2D.Float();
        q.setCurve(0, 0, 10, 10, 20, 0);
        System.out.println(q.getY2());
    }
}
