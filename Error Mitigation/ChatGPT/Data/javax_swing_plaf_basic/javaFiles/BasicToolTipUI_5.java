import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicToolTipUI;
import java.awt.Dimension;

public class BasicToolTipUI_5 {
    public static void main(String[] args) {
        BasicToolTipUI basicToolTipUI = new BasicToolTipUI();
        JComponent component = new JComponent() {
        };
        Dimension maximumSize = basicToolTipUI.getMaximumSize(component);
        System.out.println("Maximum size: " + maximumSize);
    }
}
