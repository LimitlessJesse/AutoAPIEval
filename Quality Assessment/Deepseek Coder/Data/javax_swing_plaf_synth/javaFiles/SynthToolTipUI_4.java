import javax.swing.*;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.awt.*;

public class SynthToolTipUI_4 {
    public static void main(String[] args) {
        JComponent component = new JLabel("Hello, World!");
        SynthToolTipUI toolTipUI = (SynthToolTipUI) UIManager.getUI(component);
        Dimension preferredSize = toolTipUI.getPreferredSize(component);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
