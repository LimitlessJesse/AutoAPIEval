import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuBar_2 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();

        // Create a new Menu
        Menu fileMenu = new Menu("File");

        // Create MenuItems
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Add MenuItems to the Menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add the Menu to the MenuBar
        menuBar.add(fileMenu);

        // Get the Menu at position 0
        Menu firstMenu = menuBar.getMenu(0);

        // Print the name of the first Menu
        System.out.println(firstMenu.getLabel());
    }
}
