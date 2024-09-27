import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicPanelUI;

public class BasicPanelUI_2 {
    public static void main(String[] args) {
        BasicPanelUI basicPanelUI = new BasicPanelUI();
        JComponent component = new JComponent() {
        };
        basicPanelUI.uninstallUI(component);
    }
}
