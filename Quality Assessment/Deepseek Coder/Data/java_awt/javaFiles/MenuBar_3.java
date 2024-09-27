import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;

public class MenuBar_3 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        menuBar.add(fileMenu);
        
        int menuCount = menuBar.getMenuCount();
        System.out.println("Number of menus: " + menuCount);
    }
}
