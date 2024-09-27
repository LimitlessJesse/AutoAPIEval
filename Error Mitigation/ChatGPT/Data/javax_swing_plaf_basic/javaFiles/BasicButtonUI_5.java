import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.Dimension;

public class BasicButtonUI_5 {
    public static void main(String[] args) {
        BasicButtonUI basicButtonUI = new BasicButtonUI();
        JComponent component = new JComponent() {};
        Dimension minimumSize = basicButtonUI.getMinimumSize(component);
        System.out.println("Minimum size: " + minimumSize);
    }
}
