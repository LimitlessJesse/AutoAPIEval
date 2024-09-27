import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalTheme;

public class MetalTheme_2 {
    public static void main(String[] args) {
        MetalTheme theme = new MetalTheme() {
            @Override
            public ColorUIResource getPrimaryControlShadow() {
                return new ColorUIResource(100, 100, 100);
            }

            // Other methods of MetalTheme can be implemented here if needed
        };

        ColorUIResource primaryControlShadow = theme.getPrimaryControlShadow();
        System.out.println("Primary Control Shadow: " + primaryControlShadow);
    }
}
