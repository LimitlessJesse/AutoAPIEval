import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthMenuBarUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("File"));
        menuBar.add(new JMenu("Edit"));

        SynthMenuBarUI ui = new SynthMenuBarUI();
        ui.paint(menuBar.getGraphics(), menuBar);

        frame.setVisible(true);
    }
}
