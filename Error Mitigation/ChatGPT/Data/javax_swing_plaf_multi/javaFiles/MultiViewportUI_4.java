import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiViewportUI;

public class MultiViewportUI_4 {
    public static void main(String[] args) {
        MultiViewportUI multiViewportUI = new MultiViewportUI();
        JComponent component = new JComponent() {
        };
        multiViewportUI.installUI(component);
    }
}
