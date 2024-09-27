import javax.swing.*;
import javax.swing.plaf.multi.MultiColorChooserUI;

public class MultiColorChooserUI_6 {
    public static void main(String[] args) {
        JColorChooser colorChooser = new JColorChooser();
        MultiColorChooserUI multiUI = new MultiColorChooserUI();
        multiUI.uninstallUI(colorChooser);
    }
}
