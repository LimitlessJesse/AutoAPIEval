import javax.swing.*;
import javax.swing.plaf.synth.SynthMenuItemUI;

public class SynthMenuItemUI_6 {
    public static void main(String[] args) {
        JMenuItem menuItem = new JMenuItem();
        SynthMenuItemUI synthMenuItemUI = new SynthMenuItemUI();
        synthMenuItemUI.uninstallUI(menuItem);
    }
}
