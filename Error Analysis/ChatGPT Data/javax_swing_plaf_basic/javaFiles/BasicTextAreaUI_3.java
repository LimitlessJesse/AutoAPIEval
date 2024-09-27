import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTextAreaUI;
import java.awt.Dimension;

public class BasicTextAreaUI_3 {
    public static void main(String[] args) {
        BasicTextAreaUI textAreaUI = new BasicTextAreaUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        
        Dimension preferredSize = textAreaUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
