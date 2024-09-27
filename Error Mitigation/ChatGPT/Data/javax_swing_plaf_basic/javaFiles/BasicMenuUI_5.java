import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicMenuUI;
import java.awt.Dimension;

public class BasicMenuUI_5 {
    public static void main(String[] args) {
        BasicMenuUI basicMenuUI = new BasicMenuUI();
        JComponent component = new JComponent() {
        };
        Dimension maximumSize = basicMenuUI.getMaximumSize(component);
        System.out.println("Maximum Size: " + maximumSize);
    }
}
