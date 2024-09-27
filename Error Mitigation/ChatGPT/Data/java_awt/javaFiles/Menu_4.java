import java.awt.Menu;

public class Menu_4 {
    public static void main(String[] args) {
        Menu menu = new Menu("File");
        menu.add("Open");
        menu.add("Save");
        menu.add("Close");
        
        System.out.println("Menu items before removeAll: " + menu.getItemCount());
        
        menu.removeAll();
        
        System.out.println("Menu items after removeAll: " + menu.getItemCount());
    }
}
