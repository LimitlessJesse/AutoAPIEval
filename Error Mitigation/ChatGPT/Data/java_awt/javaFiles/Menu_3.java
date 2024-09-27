import java.awt.Menu;

public class Menu_3 {
    public static void main(String[] args) {
        Menu menu = new Menu("File");
        menu.add("Open");
        menu.add("Save");
        menu.add("Close");
        
        System.out.println("Before removal: " + menu.getItem(1).getLabel());
        
        menu.remove(1);
        
        System.out.println("After removal: " + menu.getItem(1).getLabel());
    }
}
