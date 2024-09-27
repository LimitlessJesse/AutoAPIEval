import java.awt.Menu;
import java.awt.MenuBar;

public class MenuBar_2 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("File");
        menuBar.add(menu);
        
        // Removing the menu at index 0
        menuBar.remove(0);
        System.out.println("Menu at index 0 removed");
    }
}
