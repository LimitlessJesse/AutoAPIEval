import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;

public class FontRenderContext_2 {
    public static void main(String[] args) {
        FontRenderContext frc = new FontRenderContext(null, true, true);
        AffineTransform at = frc.getTransform();
        System.out.println(at);
    }
}
