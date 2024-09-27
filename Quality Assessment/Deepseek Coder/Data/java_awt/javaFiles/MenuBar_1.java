import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuBar_1 {
    public static void main(String[] args) {
        // Create a MenuBar
        MenuBar menuBar = new MenuBar();

        // Create a Menu
        Menu fileMenu = new Menu("File");

        // Create MenuItems
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        // Add MenuItems to Menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Add Menu to MenuBar
        menuBar.add(fileMenu);
    }
}
