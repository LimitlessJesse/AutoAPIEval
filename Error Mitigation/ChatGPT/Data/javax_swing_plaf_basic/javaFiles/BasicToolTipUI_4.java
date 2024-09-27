import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;
import java.awt.Dimension;

public class BasicToolTipUI_4 {
    public static void main(String[] args) {
        BasicToolTipUI basicToolTipUI = new BasicToolTipUI();
        JComponent component = new JComponent() {};
        Dimension minimumSize = basicToolTipUI.getMinimumSize(component);
        System.out.println("Minimum size: " + minimumSize);
    }
}
