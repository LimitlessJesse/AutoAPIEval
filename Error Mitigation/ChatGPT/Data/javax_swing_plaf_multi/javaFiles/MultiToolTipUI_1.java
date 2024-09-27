import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiToolTipUI;

public class MultiToolTipUI_1 {
    public static void main(String[] args) {
        MultiToolTipUI multiToolTipUI = new MultiToolTipUI();
        JComponent component = new JComponent() {
        };
        multiToolTipUI.installUI(component);
    }
}
