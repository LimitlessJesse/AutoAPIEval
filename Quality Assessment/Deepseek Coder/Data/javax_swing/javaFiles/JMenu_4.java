import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenu_4 {
    public static void main(String[] args) {
        // Create a JMenu
        JMenu menu = new JMenu("Menu");

        // Create a JMenuItem
        JMenuItem item = new JMenuItem("Item");

        // Add the JMenuItem to the JMenu
        menu.add(item);

        // Print the menu items
        for (JMenuItem menuItem : menu.getMenuComponents()) {
            System.out.println(menuItem.getText());
        }

        // Remove the JMenuItem from the JMenu
        menu.remove(item);

        // Print the menu items after removal
        for (JMenuItem menuItem : menu.getMenuComponents()) {
            System.out.println(menuItem.getText());
        }
    }
}
