import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuBar_5 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        Menu helpMenu = new Menu("Help");
        MenuItem aboutItem = new MenuItem("About");
        helpMenu.add(aboutItem);
        menuBar.setHelpMenu(helpMenu);
    }
}
