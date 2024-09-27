import java.awt.MenuShortcut;

public class MenuShortcut_4 {
    public static void main(String[] args) {
        MenuShortcut shortcut1 = new MenuShortcut(MenuShortcut.CTRL_DOWN_MASK);
        MenuShortcut shortcut2 = new MenuShortcut(MenuShortcut.CTRL_DOWN_MASK);
        MenuShortcut shortcut3 = new MenuShortcut(MenuShortcut.CTRL_DOWN_MASK | MenuShortcut.SHIFT_DOWN_MASK);

        System.out.println(shortcut1.equals(shortcut2)); // true
        System.out.println(shortcut1.equals(shortcut3)); // false
    }
}
