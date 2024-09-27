import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalTheme;

public class MetalTheme_4 {
    public static void main(String[] args) {
        MetalTheme theme = new MetalTheme() {
            @Override
            protected ColorUIResource getSecondary1() {
                return new ColorUIResource(255, 0, 0); // Example color values
            }
        };
        
        ColorUIResource secondary1Color = theme.getSecondary1();
        System.out.println("Secondary 1 Color: " + secondary1Color);
    }
}
