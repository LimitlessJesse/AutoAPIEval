import javax.swing.JComponent;
import javax.swing.JToolTip;

public class JToolTip_4 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        JComponent component = toolTip.getComponent();
        System.out.println("Component: " + component);
    }
}
