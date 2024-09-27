import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.RenderContext;
import java.awt.image.renderable.RenderedImageFactory;
import java.awt.RenderingHints;

public class RenderContext_39 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        RenderContext rc = g2d.getRenderContext();
        rc.setRenderingHints(rh);
        g2d.dispose();
    }
}
