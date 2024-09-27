import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTextPaneUI;

public class BasicTextPaneUI_1 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        BasicTextPaneUI ui = new BasicTextPaneUI();
        ui.installUI(component);
    }
}
