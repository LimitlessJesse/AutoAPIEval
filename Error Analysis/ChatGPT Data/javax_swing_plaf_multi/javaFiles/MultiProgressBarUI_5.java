import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiProgressBarUI;

public class MultiProgressBarUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        MultiProgressBarUI ui = new MultiProgressBarUI();
        ui.installUI(component);
    }
}
