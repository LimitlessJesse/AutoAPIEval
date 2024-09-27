import java.awt.MenuItem;

public class MenuItem_1 {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem("File");
        String label = menuItem.getLabel();
        System.out.println("Label of the menu item: " + label);
    }
}
