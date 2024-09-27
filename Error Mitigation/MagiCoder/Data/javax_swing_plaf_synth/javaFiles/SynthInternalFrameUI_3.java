import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthInternalFrameUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);
        frame.add(internalFrame);

        SynthInternalFrameUI ui = new SynthInternalFrameUI();
        ui.paint(new SynthContext(), (Graphics2D) internalFrame.getGraphics(), internalFrame);

        frame.setVisible(true);
    }
}
