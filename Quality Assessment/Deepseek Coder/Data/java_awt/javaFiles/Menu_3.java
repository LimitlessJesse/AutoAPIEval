import java.awt.Menu;
import java.awt.MenuItem;

public class Menu_3 {
    public static void main(String[] args) {
        Menu menu = new Menu("File");
        MenuItem menuItem1 = new MenuItem("Open");
        MenuItem menuItem2 = new MenuItem("Save");
        menu.add(menuItem1);
        menu.add(menuItem2);

        MenuItem item = menu.getItem(0);
        System.out.println(item.getLabel());
    }
}
