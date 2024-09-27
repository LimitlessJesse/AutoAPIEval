import java.awt.*;

public class PointerInfo_2 {
    public static void main(String[] args) {
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        GraphicsDevice device = pointerInfo.getDevice();
        System.out.println("GraphicsDevice: " + device);
    }
}
