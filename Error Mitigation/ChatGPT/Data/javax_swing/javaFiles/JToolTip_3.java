import javax.swing.JComponent;
import javax.swing.JToolTip;

public class JToolTip_3 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        JComponent component = new JComponent() {}; // Creating a dummy JComponent for demonstration
        toolTip.setComponent(component);
    }
}
