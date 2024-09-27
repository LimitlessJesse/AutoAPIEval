import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.synth.SynthViewportUI;

public class SynthViewportUI_1 {
    public static void main(String[] args) {
        SynthViewportUI ui = new SynthViewportUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        ui.installUI(component);
        
        // Additional code to verify the installation of UI
        ComponentUI installedUI = component.getUI();
        if(installedUI instanceof SynthViewportUI) {
            System.out.println("SynthViewportUI installed successfully");
        } else {
            System.out.println("UI installation failed");
        }
    }
}
