import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiButtonUI;
import java.awt.*;

public class MultiButtonUI_2 {
    public static void main(String[] args) {
        MultiButtonUI multiButtonUI = new MultiButtonUI();
        JComponent component = new JComponent() {
        };
        Dimension maxDimension = multiButtonUI.getMaximumSize(component);
        System.out.println("Maximum Size: " + maxDimension);
    }
}
