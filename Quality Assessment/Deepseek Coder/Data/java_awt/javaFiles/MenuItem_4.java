import java.awt.MenuItem;

public class MenuItem_4 {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem();
        menuItem.setEnabled(true);
        System.out.println("Is menu item enabled? " + menuItem.isEnabled());

        menuItem.setEnabled(false);
        System.out.println("Is menu item enabled? " + menuItem.isEnabled());
    }
}
