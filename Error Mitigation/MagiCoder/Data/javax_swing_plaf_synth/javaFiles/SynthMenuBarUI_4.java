import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthMenuBarUI_4 {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();
        SynthMenuBarUI ui = new SynthMenuBarUI();
        ui.installUI(menuBar);
        ui.paint(menuBar.getGraphics(), menuBar.getGraphics(), menuBar.getBounds());
    }
}
