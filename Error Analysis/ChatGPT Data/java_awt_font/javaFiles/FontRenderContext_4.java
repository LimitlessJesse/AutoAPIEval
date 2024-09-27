import java.awt.font.FontRenderContext;

public class FontRenderContext_4 {
    public static void main(String[] args) {
        FontRenderContext frc = new FontRenderContext(null, true, true);
        boolean antiAliased = frc.isAntiAliased();
        System.out.println("Text anti-aliasing enabled: " + antiAliased);
    }
}
