import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiButtonUI;
import java.awt.Dimension;

public class MultiButtonUI_3 {
    public static void main(String[] args) {
        MultiButtonUI multiButtonUI = new MultiButtonUI();
        JComponent component = new JComponent() {
        };

        Dimension minimumSize = multiButtonUI.getMinimumSize(component);
        System.out.println("Minimum Size: " + minimumSize);
    }
}
