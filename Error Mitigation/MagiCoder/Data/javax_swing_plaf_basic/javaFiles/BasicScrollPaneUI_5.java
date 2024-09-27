import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class BasicScrollPaneUI_5 {
    public static void main(String[] args) {
        BasicScrollPaneUI basicScrollPaneUI = new BasicScrollPaneUI();
        JComponent jComponent = new JComponent();
        basicScrollPaneUI.uninstallUI(jComponent);
    }
}
