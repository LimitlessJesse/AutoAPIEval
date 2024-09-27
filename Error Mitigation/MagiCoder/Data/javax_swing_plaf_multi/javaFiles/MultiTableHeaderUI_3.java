import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTableHeaderUI;

public class MultiTableHeaderUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiTableHeaderUI multiTableHeaderUI = new MultiTableHeaderUI();
        multiTableHeaderUI.installUI(component);
    }
}
