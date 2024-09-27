import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;

public class FontRenderContext_4 {
    public static void main(String[] args) {
        AffineTransform at = new AffineTransform();
        FontRenderContext frc = new FontRenderContext(at, true, true);
        boolean isAntiAliased = frc.isAntiAliased();
        System.out.println("Anti-aliasing is " + (isAntiAliased? "enabled" : "disabled"));
    }
}
