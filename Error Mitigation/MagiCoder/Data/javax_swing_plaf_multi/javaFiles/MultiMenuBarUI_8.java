import javax.swing.*;
import javax.swing.plaf.multi.*;
import java.awt.*;

public class MultiMenuBarUI_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("File"));
        menuBar.add(new JMenu("Edit"));
        frame.setJMenuBar(menuBar);
        frame.setSize(300, 200);
        frame.setVisible(true);

        MultiMenuBarUI multiMenuBarUI = new MultiMenuBarUI();
        multiMenuBarUI.update(frame.getGraphics(), menuBar);
    }
}
