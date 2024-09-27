import java.awt.*;
import java.awt.image.VolatileImage;

public class VolatileImage_1 {
    public static void main(String[] args) {
        VolatileImage image = new VolatileImage(100, 100);
        Graphics2D graphics = image.createGraphics();
        graphics.setColor(Color.RED);
        graphics.fillRect(0, 0, 100, 100);
        graphics.dispose();
    }
}
