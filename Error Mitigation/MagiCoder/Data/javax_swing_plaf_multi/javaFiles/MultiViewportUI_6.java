import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiViewportUI;

public class MultiViewportUI_6 {
    public static void main(String[] args) {
        JComponent component = new JComponent();
        MultiViewportUI multiViewportUI = new MultiViewportUI();
        multiViewportUI.installUI(component);
    }
}
