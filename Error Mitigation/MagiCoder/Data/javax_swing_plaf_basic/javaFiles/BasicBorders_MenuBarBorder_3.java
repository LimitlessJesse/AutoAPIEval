import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_MenuBarBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new BasicBorders.MenuBarBorder());

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
