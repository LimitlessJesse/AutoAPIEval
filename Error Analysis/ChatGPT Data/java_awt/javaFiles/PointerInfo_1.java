import java.awt.*;

public class PointerInfo_1 {
    public static void main(String[] args) {
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        Point point = pointerInfo.getLocation();
        int x = (int) point.getX();
        int y = (int) point.getY();
        System.out.println("Mouse location - X: " + x + ", Y: " + y);
    }
}
