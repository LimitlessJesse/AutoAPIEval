import javax.swing.*;
import java.awt.event.KeyEvent;

public class JMenuItem_13 {
    public static void main(String[] args) {
        JMenuItem menuItem = new JMenuItem("Menu Item");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_MASK));
        
        JMenu menu = new JMenu("Menu");
        menu.add(menuItem);
        
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(menu);
        frame.pack();
        frame.setVisible(true);
    }
}
