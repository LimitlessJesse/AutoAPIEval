import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Graphics_3 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.RED);
        g.drawLine(0, 0, 100, 100);
    }
}
