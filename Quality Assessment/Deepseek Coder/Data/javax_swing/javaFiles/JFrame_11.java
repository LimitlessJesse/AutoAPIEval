import javax.swing.*;
import java.awt.*;

public class JFrame_11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("Menu Item");
        menu.add(menuItem);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
