import java.awt.geom.Point2D;

public class Point2D_Float_3 {
    public static void main(String[] args) {
        Point2D.Float point = new Point2D.Float();
        System.out.println("Before setLocation: " + point);
        
        point.setLocation(10.5f, 20.7f);
        System.out.println("After setLocation: " + point);
    }
}
