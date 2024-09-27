import java.awt.Menu;
import java.awt.MenuItem;

public class Menu_2 {
    public static void main(String[] args) {
        Menu menu = new Menu("File");
        menu.add(new MenuItem("Open"));
        menu.add(new MenuItem("Save"));
        menu.add(new MenuItem("Close"));

        System.out.println("Before removal:");
        for (int i = 0; i < menu.getItemCount(); i++) {
            System.out.println(menu.getItem(i).getLabel());
        }

        menu.remove(1);

        System.out.println("\nAfter removal:");
        for (int i = 0; i < menu.getItemCount(); i++) {
            System.out.println(menu.getItem(i).getLabel());
        }
    }
}
