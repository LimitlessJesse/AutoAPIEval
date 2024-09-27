import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalTheme;

public class MetalTheme_3 {
    public static void main(String[] args) {
        MetalTheme theme = new MetalTheme() {
            @Override
            protected ColorUIResource getPrimary3() {
                return new ColorUIResource(0, 0, 255); // Example color values
            }
        };
        
        ColorUIResource primary3Color = theme.getPrimary3();
        System.out.println("Primary 3 color: " + primary3Color);
    }
}
