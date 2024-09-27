import javax.swing.*;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import java.awt.*;

public class MetalPopupMenuSeparatorUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Item 1"));
        popupMenu.add(new JSeparator());
        popupMenu.add(new JMenuItem("Item 2"));

        JMenuItem menuItem = new JMenuItem("Item 3");
        popupMenu.add(menuItem);

        popupMenu.show(frame, 100, 100);

        // Get the UI of the popup menu
        MetalPopupMenuSeparatorUI ui = (MetalPopupMenuSeparatorUI) menuItem.getUI();

        // Paint the separator
        ui.paint(frame.getGraphics(), menuItem);
    }
}
