import javax.swing.*;
import javax.swing.plaf.synth.SynthButtonUI;
import java.awt.*;

public class SynthButtonUI_4 {
    public static void main(String[] args) {
        JButton button = new JButton("Button");
        SynthButtonUI synthButtonUI = new SynthButtonUI();
        Dimension preferredSize = synthButtonUI.getPreferredSize(button);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
