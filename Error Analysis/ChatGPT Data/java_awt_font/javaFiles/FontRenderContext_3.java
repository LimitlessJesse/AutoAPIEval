import java.awt.geom.AffineTransform;
import java.awt.font.FontRenderContext;

public class FontRenderContext_3 {
    public static void main(String[] args) {
        FontRenderContext frc = new FontRenderContext(new AffineTransform(), true, true);
        AffineTransform transform = frc.getTransform();
        
        System.out.println("FontRenderContext transform: " + transform);
    }
}
