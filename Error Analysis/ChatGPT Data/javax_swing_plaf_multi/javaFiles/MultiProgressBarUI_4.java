import javax.swing.plaf.multi.MultiProgressBarUI;
import javax.swing.JComponent;

public class MultiProgressBarUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        MultiProgressBarUI multiUI = new MultiProgressBarUI(); // Creating an instance of MultiProgressBarUI
        
        multiUI.uninstallUI(component); // Calling the uninstallUI method
    }
}
