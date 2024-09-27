import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiLabelUI;

public class MultiLabelUI_2 {
    public static void main(String[] args) {
        MultiLabelUI multiLabelUI = new MultiLabelUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        multiLabelUI.uninstallUI(component);
    }
}
