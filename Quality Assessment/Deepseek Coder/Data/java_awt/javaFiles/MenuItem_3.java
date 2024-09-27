import java.awt.Menu;
import java.awt.MenuItem;

public class MenuItem_3 {
    public static void main(String[] args) {
        Menu menu = new Menu("File");
        MenuItem menuItem = new MenuItem("Open");
        menu.add(menuItem);

        // Check if the menu item is enabled
        boolean isEnabled = menuItem.isEnabled();
        System.out.println("Is menu item enabled? " + isEnabled);

        // Disable the menu item
        menuItem.setEnabled(false);

        // Check if the menu item is enabled after disabling
        isEnabled = menuItem.isEnabled();
        System.out.println("Is menu item enabled after disabling? " + isEnabled);
    }
}
