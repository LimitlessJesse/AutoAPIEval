import java.awt.Menu;
import java.awt.MenuBar;

public class MenuBar_3 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        
        // Adding menus to the menu bar
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        
        // Getting the menu at index 1
        Menu menu = menuBar.getMenu(1);
        System.out.println("Menu at index 1: " + menu.getLabel());
    }
}
