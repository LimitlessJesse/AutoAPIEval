import java.awt.*;

public class PointerInfo_1 {
    public static void main(String[] args) {
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        Point point = pointerInfo.getLocation();
        System.out.println("Pointer coordinates: " + point);
    }
}
