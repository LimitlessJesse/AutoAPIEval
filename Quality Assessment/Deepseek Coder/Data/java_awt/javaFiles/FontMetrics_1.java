import java.awt.*;

public class FontMetrics_1 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        Graphics g = gc.createCompatibleGraphics();
        Font font = new Font("Serif", Font.PLAIN, 10);
        FontMetrics fm = g.getFontMetrics(font);
        int ascent = fm.getAscent();
        System.out.println("Ascent: " + ascent);
    }
}
