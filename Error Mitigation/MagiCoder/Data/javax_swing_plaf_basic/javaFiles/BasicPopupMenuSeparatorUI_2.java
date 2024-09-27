import javax.swing.*;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import java.awt.*;

public class BasicPopupMenuSeparatorUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem menuItem = new JMenuItem("Menu Item");
        popupMenu.add(menuItem);

        BasicPopupMenuSeparatorUI separatorUI = new BasicPopupMenuSeparatorUI();
        separatorUI.paint(frame.getGraphics(), popupMenu);
    }
}
