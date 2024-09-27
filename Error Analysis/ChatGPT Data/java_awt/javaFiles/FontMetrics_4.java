import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class FontMetrics_4 {
    public static void main(String[] args) {
        Font font = new Font("Arial", Font.PLAIN, 16);
        Graphics graphics = new Graphics2D() {
            @Override
            public void setRenderingHint(RenderingHints.Key key, Object value) {
            }

            @Override
            public Object getRenderingHint(RenderingHints.Key key) {
                return null;
            }

            @Override
            public void setRenderingHints(Map<?, ?> hints) {
            }

            @Override
            public void addRenderingHints(Map<?, ?> hints) {
            }

            @Override
            public RenderingHints getRenderingHints() {
                return null;
            }
        };
        FontMetrics fontMetrics = graphics.getFontMetrics(font);
        int descent = fontMetrics.getDescent();
        System.out.println("Descent: " + descent);
    }
}
