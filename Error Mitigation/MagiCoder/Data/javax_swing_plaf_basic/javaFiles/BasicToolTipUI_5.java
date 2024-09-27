import javax.swing.*;
import javax.swing.plaf.basic.BasicToolTipUI;

public class BasicToolTipUI_5 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        BasicToolTipUI toolTipUI = new BasicToolTipUI();
        toolTipUI.installUI(toolTip);
    }
}
