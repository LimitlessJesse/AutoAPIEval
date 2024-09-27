import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTabbedPaneUI;

public class MultiTabbedPaneUI_5 {
    public static void main(String[] args) {
        MultiTabbedPaneUI ui = new MultiTabbedPaneUI();
        JComponent component = new JComponent() {};
        System.out.println(ui.getMinimumSize(component));
    }
}
