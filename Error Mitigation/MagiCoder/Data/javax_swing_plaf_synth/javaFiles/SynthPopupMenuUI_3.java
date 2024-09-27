import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthPopupMenuUI_3 {
    public static void main(String[] args) {
        JPopupMenu popupMenu = new JPopupMenu();
        SynthPopupMenuUI ui = new SynthPopupMenuUI();
        ui.paint(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ui.paint(g, this);
            }
        }.getGraphics(), popupMenu);
    }
}
