import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthPopupMenuUI_4 {
    public static void main(String[] args) {
        JPopupMenu popupMenu = new JPopupMenu();
        SynthPopupMenuUI ui = (SynthPopupMenuUI) UIManager.getUI(popupMenu);
        ui.installDefaults(popupMenu);
        popupMenu.setVisible(true);
    }
}
