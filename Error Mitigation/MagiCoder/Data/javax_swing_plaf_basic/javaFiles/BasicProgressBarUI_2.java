import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

public class BasicProgressBarUI_2 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        BasicProgressBarUI ui = new BasicProgressBarUI();
        Dimension preferredSize = ui.getPreferredSize(progressBar);
        System.out.println("Preferred size: " + preferredSize);
    }
}
