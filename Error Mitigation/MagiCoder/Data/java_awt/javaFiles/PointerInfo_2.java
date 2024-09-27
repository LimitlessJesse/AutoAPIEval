import java.awt.MouseInfo;
import java.awt.Point;

public class PointerInfo_2 {
    public static void main(String[] args) {
        Point point = MouseInfo.getPointerInfo().getLocation();
        System.out.println("X: " + point.getX() + ", Y: " + point.getY());
    }
}
