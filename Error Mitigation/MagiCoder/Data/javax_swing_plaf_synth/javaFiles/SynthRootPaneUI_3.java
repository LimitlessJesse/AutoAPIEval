import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthRootPaneUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        SynthRootPaneUI ui = new SynthRootPaneUI();
        ui.paint(frame.getGraphics(), frame.getRootPane());

        frame.setVisible(true);
    }
}
