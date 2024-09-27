import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthToolBarUI_3 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        SynthToolBarUI ui = new SynthToolBarUI();
        ui.paint(new SynthContext(), toolBar.getGraphics(), toolBar);
    }
}
