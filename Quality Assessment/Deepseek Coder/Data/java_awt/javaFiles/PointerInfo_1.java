import java.awt.PointerInfo;
import java.awt.MouseInfo;
import java.awt.Point;

public class PointerInfo_1 {
    public static void main(String[] args) {
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        Point point = pointerInfo.getLocation();

        System.out.println("X: " + point.x + ", Y: " + point.y);
    }
}
