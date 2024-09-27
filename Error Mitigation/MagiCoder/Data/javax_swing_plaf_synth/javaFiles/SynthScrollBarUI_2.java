import javax.swing.*;
import javax.swing.plaf.synth.SynthScrollBarUI;
import java.awt.*;

public class SynthScrollBarUI_2 {
    public static void main(String[] args) {
        JScrollBar scrollBar = new JScrollBar();
        SynthScrollBarUI synthScrollBarUI = new SynthScrollBarUI();
        Dimension preferredSize = synthScrollBarUI.getPreferredSize(scrollBar);
        System.out.println("Preferred Width: " + preferredSize.width);
        System.out.println("Preferred Height: " + preferredSize.height);
    }
}
