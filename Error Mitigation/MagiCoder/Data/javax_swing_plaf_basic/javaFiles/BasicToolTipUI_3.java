import javax.swing.*;
import javax.swing.plaf.basic.BasicToolTipUI;

public class BasicToolTipUI_3 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        BasicToolTipUI basicToolTipUI = new BasicToolTipUI();
        basicToolTipUI.uninstallDefaults(toolTip);
    }
}
