import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class SynthSeparatorUI_1 {
    public static void main(String[] args) {
        SynthSeparatorUI ui = new SynthSeparatorUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ui.installUI(component);
        
        // Additional code to verify the installation of UI
        ComponentUI installedUI = component.getUI();
        if(installedUI instanceof SynthSeparatorUI) {
            System.out.println("SynthSeparatorUI installed successfully");
        } else {
            System.out.println("UI installation failed");
        }
    }
}
