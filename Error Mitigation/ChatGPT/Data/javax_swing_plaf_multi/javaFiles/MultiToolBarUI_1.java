import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiToolBarUI;

public class MultiToolBarUI_1 {
    public static void main(String[] args) {
        MultiToolBarUI multiToolBarUI = new MultiToolBarUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        multiToolBarUI.installUI(component);
    }
}
