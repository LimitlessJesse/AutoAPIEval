import java.awt.geom.Path2D;

public class Path2D_Float_3 {
    public static void main(String[] args) {
        Path2D.Float path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        path.lineTo(30, 30);
        System.out.println(path);
    }
}
