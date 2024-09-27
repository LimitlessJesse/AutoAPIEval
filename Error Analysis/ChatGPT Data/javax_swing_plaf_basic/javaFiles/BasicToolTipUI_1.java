import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicToolTipUI;
import java.awt.Dimension;

public class BasicToolTipUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        BasicToolTipUI toolTipUI = new BasicToolTipUI();

        Dimension preferredSize = toolTipUI.getPreferredSize(component);
        System.out.println("Preferred size: " + preferredSize);
    }
}
