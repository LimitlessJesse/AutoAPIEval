import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class MetalLookAndFeel_5 {
    public static void main(String[] args) {
        MetalLookAndFeel metalLF = new MetalLookAndFeel();
        boolean isSupported = metalLF.isSupportedLookAndFeel();
        System.out.println("Is Metal Look and Feel supported: " + isSupported);
    }
}
