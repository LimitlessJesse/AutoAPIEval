import java.awt.MenuShortcut;

public class MenuShortcut_5 {
    public static void main(String[] args) {
        MenuShortcut shortcut1 = new MenuShortcut(83);
        MenuShortcut shortcut2 = new MenuShortcut(83);
        
        boolean result = shortcut1.equals(shortcut2);
        System.out.println("Are the MenuShortcuts equal? " + result);
    }
}
