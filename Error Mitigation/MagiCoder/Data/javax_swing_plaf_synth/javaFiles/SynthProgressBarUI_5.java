import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthProgressBarUI_5 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        SynthProgressBarUI ui = new SynthProgressBarUI();
        ui.installUI(progressBar);
        ui.update(progressBar.getGraphics(), progressBar);
    }
}
