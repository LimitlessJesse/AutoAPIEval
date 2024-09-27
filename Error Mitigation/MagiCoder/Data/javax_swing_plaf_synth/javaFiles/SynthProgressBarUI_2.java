import javax.swing.*;
import javax.swing.plaf.synth.SynthProgressBarUI;
import java.awt.*;

public class SynthProgressBarUI_2 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        SynthProgressBarUI ui = new SynthProgressBarUI();
        Dimension preferredSize = ui.getPreferredSize(progressBar);
        System.out.println(preferredSize);
    }
}
