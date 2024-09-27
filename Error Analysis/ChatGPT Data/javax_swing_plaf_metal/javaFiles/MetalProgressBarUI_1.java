import javax.swing.*;
import javax.swing.plaf.metal.MetalProgressBarUI;
import java.awt.*;

public class MetalProgressBarUI_1 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        MetalProgressBarUI metalUI = new MetalProgressBarUI();

        Graphics g = progressBar.getGraphics();

        // Call the paintDeterminate method
        metalUI.paintDeterminate(g, progressBar);
    }
}
