import java.awt.*;

public class Menu_4 {
    public static void main(String[] args) {
        Menu menu = new Menu("Menu");
        menu.add(new MenuItem("Item 1"));
        menu.add(new MenuItem("Item 2"));
        
        System.out.println("Number of items in the menu: " + menu.getItemCount());
    }
}
