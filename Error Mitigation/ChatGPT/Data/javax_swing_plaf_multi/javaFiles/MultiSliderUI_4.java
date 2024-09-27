import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiSliderUI;

public class MultiSliderUI_4 {
    public static void main(String[] args) {
        MultiSliderUI multiSliderUI = new MultiSliderUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        multiSliderUI.uninstallUI(component);
    }
}
