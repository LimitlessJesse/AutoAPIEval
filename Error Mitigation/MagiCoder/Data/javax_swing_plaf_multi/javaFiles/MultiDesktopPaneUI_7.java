import javax.swing.*;
import javax.swing.plaf.multi.MultiDesktopPaneUI;
import java.awt.*;

public class MultiDesktopPaneUI_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JDesktopPane desktopPane = new JDesktopPane();
        frame.setContentPane(desktopPane);

        MultiDesktopPaneUI multiDesktopPaneUI = new MultiDesktopPaneUI();
        multiDesktopPaneUI.paint(desktopPane.getGraphics(), desktopPane);
    }
}
