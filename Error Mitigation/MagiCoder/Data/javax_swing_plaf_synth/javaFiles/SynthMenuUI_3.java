import javax.swing.*;
import javax.swing.plaf.synth.SynthMenuUI;
import java.awt.*;

public class SynthMenuUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenu menu = new JMenu("Menu");
        menu.add(new JMenuItem("Item 1"));
        menu.add(new JMenuItem("Item 2"));

        SynthMenuUI menuUI = new SynthMenuUI();
        menuUI.paint(frame.getGraphics(), menu);

        frame.setVisible(true);
    }
}
