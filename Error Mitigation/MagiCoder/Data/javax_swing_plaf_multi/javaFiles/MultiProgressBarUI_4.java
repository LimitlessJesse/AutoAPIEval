import javax.swing.*;
import javax.swing.plaf.multi.MultiProgressBarUI;
import java.awt.*;

public class MultiProgressBarUI_4 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        MultiProgressBarUI multiProgressBarUI = new MultiProgressBarUI();
        Dimension preferredSize = multiProgressBarUI.getPreferredSize(progressBar);
        System.out.println("Preferred Size: " + preferredSize);
    }
}
