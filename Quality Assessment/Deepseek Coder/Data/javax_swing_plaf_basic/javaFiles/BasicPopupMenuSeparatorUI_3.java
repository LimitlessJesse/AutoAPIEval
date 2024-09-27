import javax.swing.*;
import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;
import java.awt.*;

public class BasicPopupMenuSeparatorUI_3 {
    public static void main(String[] args) {
        JPopupMenu popup = new JPopupMenu();
        JMenuItem item = new JMenuItem("Item");
        popup.add(item);

        BasicPopupMenuSeparatorUI separatorUI = new BasicPopupMenuSeparatorUI();
        Graphics g = popup.getGraphics();
        separatorUI.paint(g, item);
    }
}
