import javax.swing.plaf.multi.MultiColorChooserUI;
import javax.swing.JComponent;

public class MultiColorChooserUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {};
        MultiColorChooserUI colorChooserUI = new MultiColorChooserUI();
        colorChooserUI.uninstallUI(component);
    }
}
