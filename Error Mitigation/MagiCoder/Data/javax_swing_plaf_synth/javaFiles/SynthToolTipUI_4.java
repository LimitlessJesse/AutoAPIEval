import javax.swing.*;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.awt.*;

public class SynthToolTipUI_4 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        SynthToolTipUI synthToolTipUI = new SynthToolTipUI();
        Dimension preferredSize = synthToolTipUI.getPreferredSize(toolTip);
        System.out.println(preferredSize);
    }
}
