import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.Dimension;

public class BasicButtonUI_4 {
    public static void main(String[] args) {
        BasicButtonUI basicButtonUI = new BasicButtonUI();
        JComponent component = new JComponent() {
        };
        Dimension preferredSize = basicButtonUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
