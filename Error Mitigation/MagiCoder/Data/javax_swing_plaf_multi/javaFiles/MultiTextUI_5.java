import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTextUI;

public class MultiTextUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiTextUI multiTextUI = new MultiTextUI();
        multiTextUI.installUI(component);
    }
}
