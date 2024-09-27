import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.multi.MultiViewportUI;
import javax.swing.JComponent;

public class MultiViewportUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        ComponentUI ui = MultiViewportUI.createUI(component);
        System.out.println("UI instance created: " + ui.toString());
    }
}
