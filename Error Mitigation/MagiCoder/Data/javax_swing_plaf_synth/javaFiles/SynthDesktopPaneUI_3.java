import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthDesktopPaneUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktopPane = new JDesktopPane();
        SynthDesktopPaneUI ui = (SynthDesktopPaneUI) UIManager.getUI(desktopPane);
        Graphics2D g2d = (Graphics2D) desktopPane.getGraphics();
        SynthContext context = ui.getSynthContext();
        ui.paint(context, g2d);

        frame.add(desktopPane);
        frame.setVisible(true);
    }
}
