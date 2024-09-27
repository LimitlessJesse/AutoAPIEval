import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthMenuItemUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("Item");
        menu.add(menuItem);
        menuBar.add(menu);

        SynthContext context = new SynthContext();
        SynthMenuItemUI menuItemUI = new SynthMenuItemUI();
        menuItemUI.install(menuItem);

        Graphics2D g2d = (Graphics2D) frame.getGraphics();
        menuItemUI.paint(context, g2d, menuItem);

        frame.setVisible(true);
    }
}
