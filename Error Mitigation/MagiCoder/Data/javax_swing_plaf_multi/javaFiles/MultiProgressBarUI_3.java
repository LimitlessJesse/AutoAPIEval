import javax.swing.*;
import javax.swing.plaf.multi.MultiProgressBarUI;
import java.awt.*;

public class MultiProgressBarUI_3 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        MultiProgressBarUI multiProgressBarUI = new MultiProgressBarUI();
        multiProgressBarUI.paint(progressBar.getGraphics(), progressBar);
    }
}
