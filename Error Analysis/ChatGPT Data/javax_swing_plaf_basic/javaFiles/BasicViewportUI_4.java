import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicViewportUI;

public class BasicViewportUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        BasicViewportUI viewportUI = new BasicViewportUI();
        viewportUI.installDefaults(component);
    }
}
