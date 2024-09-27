import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.Dimension;

public class BasicProgressBarUI_3 {
    public static void main(String[] args) {
        BasicProgressBarUI progressBarUI = new BasicProgressBarUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = progressBarUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
