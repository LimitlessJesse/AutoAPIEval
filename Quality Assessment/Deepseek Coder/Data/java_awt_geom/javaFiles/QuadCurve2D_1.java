import java.awt.geom.QuadCurve2D;

public class QuadCurve2D_1 {
    public static void main(String[] args) {
        QuadCurve2D qc = new QuadCurve2D.Double();
        qc.setCurve(10, 10, 20, 20, 30, 30);
        System.out.println(qc);
    }
}
