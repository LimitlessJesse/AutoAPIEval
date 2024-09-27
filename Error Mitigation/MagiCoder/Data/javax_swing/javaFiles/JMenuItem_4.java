import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenuItem_4 {
    public static void main(String[] args) {
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem = new JMenuItem("Menu Item");
        
        menu.add(menuItem);
        
        // Enabling the menu item
        menuItem.setEnabled(true);
        
        // Disabling the menu item
        menuItem.setEnabled(false);
    }
}
