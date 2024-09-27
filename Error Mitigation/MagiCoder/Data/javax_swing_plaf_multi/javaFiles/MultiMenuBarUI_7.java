import javax.swing.*;
import javax.swing.plaf.multi.MultiMenuBarUI;
import java.awt.*;

public class MultiMenuBarUI_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("File"));
        menuBar.add(new JMenu("Edit"));

        MultiMenuBarUI multiMenuBarUI = new MultiMenuBarUI();
        multiMenuBarUI.paint(frame.getGraphics(), menuBar);

        frame.setVisible(true);
    }
}
