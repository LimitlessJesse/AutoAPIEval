import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

public class BasicProgressBarUI_4 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        BasicProgressBarUI progressBarUI = new BasicProgressBarUI();

        Graphics g = progressBar.getGraphics();
        progressBarUI.paintDeterminate(g, progressBar);
    }
}
