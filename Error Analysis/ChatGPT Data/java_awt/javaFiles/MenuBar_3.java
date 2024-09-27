import java.awt.Menu;
import java.awt.MenuBar;

public class MenuBar_3 {
    public static void main(String[] args) {
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        menuBar.add(fileMenu);
        Menu getMenu = menuBar.getMenu(0);
        System.out.println("Menu at index 0: " + getMenu.getLabel());
    }
}
