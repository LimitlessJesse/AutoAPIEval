import java.awt.Menu;
import java.awt.MenuItem;

public class Menu_5 {
    public static void main(String[] args) {
        Menu menu = new Menu("Menu");

        MenuItem item1 = new MenuItem("Item 1");
        MenuItem item2 = new MenuItem("Item 2");
        MenuItem item3 = new MenuItem("Item 3");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        menu.remove(1); // Removes the second item

        System.out.println("Menu items:");
        for (int i = 0; i < menu.getItemCount(); i++) {
            System.out.println(menu.getItem(i).getLabel());
        }
    }
}
