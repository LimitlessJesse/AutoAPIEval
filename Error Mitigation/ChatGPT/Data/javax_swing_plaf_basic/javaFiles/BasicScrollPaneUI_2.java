import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class BasicScrollPaneUI_2 {
    public static void main(String[] args) {
        BasicScrollPaneUI basicScrollPaneUI = new BasicScrollPaneUI();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        basicScrollPaneUI.installUI(component);
    }
}
