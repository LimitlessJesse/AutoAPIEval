import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTreeUI;

public class MultiTreeUI_3 {
    public static void main(String[] args) {
        MultiTreeUI multiTreeUI = new MultiTreeUI();
        JComponent component = new JComponent();
        multiTreeUI.installUI(component);
    }
}
