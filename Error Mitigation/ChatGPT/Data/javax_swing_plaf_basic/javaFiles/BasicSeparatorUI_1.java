import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicSeparatorUI;
import java.awt.Dimension;

public class BasicSeparatorUI_1 {
    public static void main(String[] args) {
        BasicSeparatorUI separatorUI = new BasicSeparatorUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = separatorUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
