import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicLabelUI;
import java.awt.Dimension;

public class BasicLabelUI_4 {
    public static void main(String[] args) {
        BasicLabelUI basicLabelUI = new BasicLabelUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = basicLabelUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
