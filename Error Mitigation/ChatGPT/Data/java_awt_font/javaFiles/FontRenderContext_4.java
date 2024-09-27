import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;

public class FontRenderContext_4 {
    public static void main(String[] args) {
        FontRenderContext frc = new FontRenderContext(new AffineTransform(), true, true);
        AffineTransform transform = frc.getTransform();
        System.out.println("Transform: " + transform);
    }
}
