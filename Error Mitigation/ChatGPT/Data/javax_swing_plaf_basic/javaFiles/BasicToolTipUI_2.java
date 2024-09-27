import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;

public class BasicToolTipUI_2 {
    public static void main(String[] args) {
        BasicToolTipUI basicToolTipUI = new BasicToolTipUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        basicToolTipUI.uninstallUI(component);
    }
}
