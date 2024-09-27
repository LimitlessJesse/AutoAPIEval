import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class BasicOptionPaneUI_1 {
    public static void main(String[] args) {
        BasicOptionPaneUI basicOptionPaneUI = new BasicOptionPaneUI();
        JComponent component = new JComponent() {};
        basicOptionPaneUI.installUI(component);
    }
}
