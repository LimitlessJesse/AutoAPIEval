import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.Dimension;

public class BasicButtonUI_4 {
    public static void main(String[] args) {
        BasicButtonUI buttonUI = new BasicButtonUI();
        JComponent component = new JComponent() {};
        Dimension minimumSize = buttonUI.getMinimumSize(component);
        System.out.println("Minimum Size: " + minimumSize);
    }
}
