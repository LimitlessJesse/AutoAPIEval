import java.awt.Menu;
import java.awt.MenuBar;

public class MenuBar_5 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        Menu menu1 = new Menu("Menu1");
        Menu menu2 = new Menu("Menu2");
        menuBar.add(menu1);
        menuBar.add(menu2);
        System.out.println("Before removing: " + menuBar);
        menuBar.remove(0);
        System.out.println("After removing: " + menuBar);
    }
}
