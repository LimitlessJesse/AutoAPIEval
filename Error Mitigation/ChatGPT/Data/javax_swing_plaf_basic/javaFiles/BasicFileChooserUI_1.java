import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicFileChooserUI;

public class BasicFileChooserUI_1 {
    public static void main(String[] args) {
        BasicFileChooserUI basicFileChooserUI = new BasicFileChooserUI(null);
        JComponent component = new JComponent() {};
        basicFileChooserUI.installUI(component);
    }
}
