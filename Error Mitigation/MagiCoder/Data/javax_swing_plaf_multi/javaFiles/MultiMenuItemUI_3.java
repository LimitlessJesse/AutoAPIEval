import javax.swing.*;
import javax.swing.plaf.multi.MultiMenuItemUI;
import java.awt.*;

public class MultiMenuItemUI_3 {
    public static void main(String[] args) {
        JMenuItem menuItem = new JMenuItem("Menu Item");
        MultiMenuItemUI multiMenuItemUI = new MultiMenuItemUI();
        multiMenuItemUI.paint(menuItem.getGraphics(), menuItem);
    }
}
