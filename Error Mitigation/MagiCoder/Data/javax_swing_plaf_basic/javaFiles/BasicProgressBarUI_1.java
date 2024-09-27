import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

public class BasicProgressBarUI_1 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        progressBar.setUI(new BasicProgressBarUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                // Your implementation here
            }
        });
    }
}
