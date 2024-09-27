import javax.swing.UIManager;
import javax.swing.SwingUtilities;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;

public class MetalLookAndFeel_1 {
    public static void main(String[] args) {
        MetalTheme theme = new MyCustomMetalTheme(); // Custom MetalTheme implementation
        
        MetalLookAndFeel.setCurrentTheme(theme);

        try {
            // re-install the Metal Look and Feel
            UIManager.setLookAndFeel(new MetalLookAndFeel());

            // Update the ComponentUIs for all Components. This needs to be invoked for all windows.
            SwingUtilities.updateComponentTreeUI(rootComponent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
