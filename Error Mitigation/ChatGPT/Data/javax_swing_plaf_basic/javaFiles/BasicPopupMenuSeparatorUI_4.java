import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import java.awt.Dimension;

public class BasicPopupMenuSeparatorUI_4 {
    public static void main(String[] args) {
        BasicPopupMenuSeparatorUI ui = new BasicPopupMenuSeparatorUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = ui.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
