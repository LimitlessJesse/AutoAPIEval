import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicToolTipUI;

public class BasicToolTipUI_4 {
    public static void main(String[] args) {
        BasicToolTipUI tooltipUI = new BasicToolTipUI();
        JComponent component = new JComponent() {
        };
        tooltipUI.uninstallUI(component);
    }
}
