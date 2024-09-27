import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicToolTipUI;

public class BasicToolTipUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        BasicToolTipUI toolTipUI = new BasicToolTipUI();
        toolTipUI.installDefaults(component);
    }
}
