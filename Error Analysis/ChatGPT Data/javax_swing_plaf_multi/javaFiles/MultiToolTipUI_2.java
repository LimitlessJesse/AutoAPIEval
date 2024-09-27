import javax.swing.plaf.multi.MultiToolTipUI;
import javax.swing.JComponent;

public class MultiToolTipUI_2 {
    public static void main(String[] args) {
        MultiToolTipUI multiToolTipUI = new MultiToolTipUI();
        JComponent component = new JComponent() {};
        multiToolTipUI.installUI(component);
    }
}
