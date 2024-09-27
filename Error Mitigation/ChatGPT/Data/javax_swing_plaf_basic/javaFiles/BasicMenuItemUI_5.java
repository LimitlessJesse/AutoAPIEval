import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;
import java.awt.Dimension;

public class BasicMenuItemUI_5 {
    public static void main(String[] args) {
        BasicMenuItemUI basicMenuItemUI = new BasicMenuItemUI();
        JComponent component = new JComponent() {};
        Dimension minimumSize = basicMenuItemUI.getMinimumSize(component);
        System.out.println("Minimum size: " + minimumSize);
    }
}
