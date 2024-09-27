import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;

public class MetalLookAndFeel_2 {
    public static void main(String[] args) {
        MetalTheme currentTheme = MetalLookAndFeel.getCurrentTheme();
        System.out.println("Current theme: " + currentTheme);
    }
}
