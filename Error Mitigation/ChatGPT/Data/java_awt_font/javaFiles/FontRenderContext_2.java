import java.awt.font.FontRenderContext;

public class FontRenderContext_2 {
    public static void main(String[] args) {
        FontRenderContext frc = new FontRenderContext(null, true, true);
        boolean isAntiAliased = frc.isAntiAliased();
        System.out.println("Is text anti-aliased: " + isAntiAliased);
    }
}
