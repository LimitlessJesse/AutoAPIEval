import java.awt.Menu;
import java.awt.MenuBar;

public class MenuBar_5 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        Menu helpMenu = new Menu("Help");
        
        menuBar.setHelpMenu(helpMenu);
    }
}
