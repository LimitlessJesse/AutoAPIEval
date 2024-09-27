import javax.swing.*;
import javax.swing.plaf.metal.MetalProgressBarUI;

public class MetalProgressBarUI_2 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        MetalProgressBarUI metalUI = new MetalProgressBarUI();
        metalUI.paintIndeterminate(g, progressBar);
    }
}
