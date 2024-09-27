import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicTreeUI;

public class BasicTreeUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        BasicTreeUI basicTreeUI = new BasicTreeUI();
        basicTreeUI.uninstallUI(component);
    }
}
