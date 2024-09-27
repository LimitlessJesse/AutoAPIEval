import javax.swing.*;
import javax.swing.plaf.synth.SynthContext;

public class SynthProgressBarUI_3 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        SynthContext context = new SynthProgressBarUI().getContext(progressBar);
        System.out.println("SynthContext: " + context.toString());
    }
}
