import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiTextUI;

public class MultiTextUI_3 {
    public static void main(String[] args) {
        MultiTextUI multiTextUI = new MultiTextUI();
        JComponent component = new JComponent() {
        };
        multiTextUI.installUI(component);
    }
}
