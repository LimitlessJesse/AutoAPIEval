import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthDesktopIconUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Button");
        SynthContext context = new SynthContext();
        SynthDesktopIconUI ui = new SynthDesktopIconUI();
        ui.paint(context, button.getGraphics(), button.getBounds());

        frame.setVisible(true);
    }
}
