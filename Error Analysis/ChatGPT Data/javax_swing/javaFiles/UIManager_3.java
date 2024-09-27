import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class UIManager_3 {
    public static void main(String[] args) {
        try {
            // Set the look and feel to MetalLookAndFeel
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (Exception e) {
            System.err.println("Error setting MetalLookAndFeel: " + e);
        }
    }
}
