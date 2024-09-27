import java.awt.MenuItem;

public class MenuItem_3 {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem("File");
        System.out.println("Is menu item enabled: " + menuItem.isEnabled());
        
        // Disable the menu item
        menuItem.setEnabled(false);
        System.out.println("Is menu item enabled: " + menuItem.isEnabled());
        
        // Enable the menu item
        menuItem.setEnabled(true);
        System.out.println("Is menu item enabled: " + menuItem.isEnabled());
    }
}
