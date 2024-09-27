import javax.swing.*;
import java.awt.event.KeyEvent;

public class JMenuItem_14 {
    public static void main(String[] args) {
        JMenuItem menuItem = new JMenuItem("Menu Item");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_MASK));

        KeyStroke accelerator = menuItem.getAccelerator();
        System.out.println("Accelerator: " + accelerator);
    }
}
