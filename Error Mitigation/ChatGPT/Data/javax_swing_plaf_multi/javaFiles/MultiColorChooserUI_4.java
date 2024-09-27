import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiColorChooserUI;

public class MultiColorChooserUI_4 {
    public static void main(String[] args) {
        MultiColorChooserUI multiColorChooserUI = new MultiColorChooserUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        multiColorChooserUI.uninstallUI(component);
    }
}
