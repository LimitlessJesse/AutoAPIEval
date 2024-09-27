import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthMenuItemUI_4 {
    public static void main(String[] args) {
        JMenuItem menuItem = new JMenuItem("Menu Item");
        SynthMenuItemUI ui = new SynthMenuItemUI();
        ui.update(menuItem.getGraphics(), menuItem);
    }
}
