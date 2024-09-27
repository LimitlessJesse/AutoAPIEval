import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class BasicProgressBarUI_3 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        BasicProgressBarUI basicProgressBarUI = new BasicProgressBarUI();
        basicProgressBarUI.installUI(progressBar);
    }
}
