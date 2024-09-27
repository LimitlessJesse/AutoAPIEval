import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import java.awt.Dimension;

public class BasicRadioButtonUI_4 {
    public static void main(String[] args) {
        BasicRadioButtonUI radioButtonUI = new BasicRadioButtonUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        Dimension preferredSize = radioButtonUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
