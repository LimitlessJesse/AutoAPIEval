import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalTheme;

public class MetalTheme_1 {
    public static void main(String[] args) {
        MetalTheme theme = new MetalTheme() {
            @Override
            protected ColorUIResource getPrimary1() {
                return new ColorUIResource(255, 0, 0); // Example color values
            }
        };
        
        ColorUIResource primary1Color = theme.getPrimary1();
        System.out.println("Primary 1 color: " + primary1Color);
    }
}
