import java.awt.MenuBar;
import java.awt.Menu;

public class MenuBar_3 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        menuBar.add(menu1);
        menuBar.add(menu2);

        Menu menu = menuBar.getMenu(0);
        System.out.println(menu.getLabel());
    }
}
