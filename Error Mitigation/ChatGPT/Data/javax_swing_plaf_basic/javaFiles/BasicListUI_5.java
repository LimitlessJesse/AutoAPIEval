import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicListUI;

public class BasicListUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        BasicListUI basicListUI = new BasicListUI();
        basicListUI.installUI(component);
    }
}
