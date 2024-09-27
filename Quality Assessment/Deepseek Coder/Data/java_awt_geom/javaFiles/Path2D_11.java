import java.awt.geom.Path2D;

public class Path2D_11 {
    public static void main(String[] args) {
        Path2D path = new Path2D.Float();
        path.moveTo(10, 10);
        path.lineTo(20, 20);
        System.out.println("Original Path: " + path);
        
        path.reset();
        System.out.println("After reset: " + path);
    }
}
