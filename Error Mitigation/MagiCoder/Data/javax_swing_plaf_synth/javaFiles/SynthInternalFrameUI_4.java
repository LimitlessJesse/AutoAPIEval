import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthInternalFrameUI_4 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("My Frame", true, true, true, true);
        SynthInternalFrameUI ui = new SynthInternalFrameUI();
        ui.installUI(frame);
        frame.setVisible(true);
        ui.update(frame.getGraphics(), frame);
    }
}
