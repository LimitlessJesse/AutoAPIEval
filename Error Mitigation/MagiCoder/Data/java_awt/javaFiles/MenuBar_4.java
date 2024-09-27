import java.awt.MenuBar;
import java.awt.Menu;

public class MenuBar_4 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        menuBar.add(menu1);
        menuBar.add(menu2);
        
        int menuCount = menuBar.getMenuCount();
        System.out.println("Number of menus: " + menuCount);
    }
}
