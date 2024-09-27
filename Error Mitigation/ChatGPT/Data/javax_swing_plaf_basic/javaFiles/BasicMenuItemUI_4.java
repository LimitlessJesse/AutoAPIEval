import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuItemUI;
import java.awt.Dimension;

public class BasicMenuItemUI_4 {
    public static void main(String[] args) {
        BasicMenuItemUI basicMenuItemUI = new BasicMenuItemUI();
        JComponent component = new JComponent() {
        };
        Dimension preferredSize = basicMenuItemUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
