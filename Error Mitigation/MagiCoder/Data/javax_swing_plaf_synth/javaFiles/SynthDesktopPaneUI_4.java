import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthDesktopPaneUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);

        SynthDesktopPaneUI ui = new SynthDesktopPaneUI();
        ui.installUI(desktopPane);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);
        desktopPane.add(internalFrame);

        internalFrame.setVisible(true);

        frame.setVisible(true);
    }
}
