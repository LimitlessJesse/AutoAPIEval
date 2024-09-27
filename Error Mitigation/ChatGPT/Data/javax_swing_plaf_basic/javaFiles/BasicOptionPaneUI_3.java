import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.JComponent;
import java.awt.Dimension;

public class BasicOptionPaneUI_3 {
    public static void main(String[] args) {
        BasicOptionPaneUI basicOptionPaneUI = new BasicOptionPaneUI();
        JComponent component = new JComponent() {};
        Dimension preferredSize = basicOptionPaneUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
