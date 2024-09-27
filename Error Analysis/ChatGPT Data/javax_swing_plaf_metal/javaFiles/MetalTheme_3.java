import javax.swing.plaf.metal.MetalTheme;
import javax.swing.plaf.FontUIResource;

public class MetalTheme_3 {
    public static void main(String[] args) {
        MetalTheme theme = new MetalTheme() {
            @Override
            public FontUIResource getControlTextFont() {
                return new FontUIResource("Arial", FontUIResource.PLAIN, 12);
            }
        };

        FontUIResource font = theme.getControlTextFont();
        System.out.println("Control Text Font: " + font.getFontName() + ", " + font.getStyle() + ", " + font.getSize());
    }
}
