import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_4 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("File");
        MenuItem menuItem = new MenuItem("Open");
        
        menu.add(menuItem);
        menuBar.add(menu);
        
        int itemCount = menuBar.getItemCount();
        System.out.println("Number of items in the menu bar: " + itemCount);
    }
}
