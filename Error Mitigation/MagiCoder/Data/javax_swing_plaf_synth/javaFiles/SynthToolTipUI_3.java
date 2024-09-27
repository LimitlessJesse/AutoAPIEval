import javax.swing.*;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.awt.*;

public class SynthToolTipUI_3 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        toolTip.setUI(new SynthToolTipUI());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        toolTip.show(frame, 100, 100);
    }
}
