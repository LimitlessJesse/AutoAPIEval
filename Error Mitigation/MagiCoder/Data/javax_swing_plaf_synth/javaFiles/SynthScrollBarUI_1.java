import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthScrollBarUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        SynthScrollBarUI ui = new SynthScrollBarUI();
        SynthContext context = new SynthContext();
        context.setComponent(scrollBar);
        ui.install(scrollBar);

        frame.add(scrollBar);
        frame.setVisible(true);
    }
}
