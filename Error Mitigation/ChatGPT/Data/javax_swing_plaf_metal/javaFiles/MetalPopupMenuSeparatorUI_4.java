import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import java.awt.Dimension;

public class MetalPopupMenuSeparatorUI_4 {
    public static void main(String[] args) {
        MetalPopupMenuSeparatorUI metalPopupMenuSeparatorUI = new MetalPopupMenuSeparatorUI();
        JComponent component = new JComponent() {};
        Dimension preferredSize = metalPopupMenuSeparatorUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
