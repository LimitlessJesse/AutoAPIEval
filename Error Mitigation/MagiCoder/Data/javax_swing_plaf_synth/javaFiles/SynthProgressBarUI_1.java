import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthProgressBarUI_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JProgressBar progressBar = new JProgressBar();
        SynthProgressBarUI synthProgressBarUI = new SynthProgressBarUI();
        BasicProgressBarUI basicProgressBarUI = new BasicProgressBarUI();
        basicProgressBarUI.installUI(progressBar);
        basicProgressBarUI.setProgressBarUI(synthProgressBarUI);

        frame.getContentPane().add(progressBar);
        frame.setVisible(true);
    }
}
