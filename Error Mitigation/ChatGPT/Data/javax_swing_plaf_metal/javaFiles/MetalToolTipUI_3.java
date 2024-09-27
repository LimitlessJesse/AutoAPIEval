import javax.swing.JComponent;
import javax.swing.plaf.metal.MetalToolTipUI;
import java.awt.Dimension;

public class MetalToolTipUI_3 {
    public static void main(String[] args) {
        MetalToolTipUI metalToolTipUI = new MetalToolTipUI();
        JComponent component = new JComponent() {
        };
        Dimension preferredSize = metalToolTipUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
