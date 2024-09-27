import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

public class BasicProgressBarUI_5 {
    public static void main(String[] args) {
        JProgressBar progressBar = new JProgressBar();
        BasicProgressBarUI ui = new BasicProgressBarUI() {
            @Override
            protected void paintDeterminate(Graphics g, JComponent c) {
                // Your implementation here
            }

            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                paintDeterminate(g, c);
            }
        };
        progressBar.setUI(ui);
    }
}
