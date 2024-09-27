import java.awt.MenuShortcut;

public class MenuShortcut_5 {
    public static void main(String[] args) {
        MenuShortcut shortcut = new MenuShortcut(MenuShortcut.CTRL_DOWN_MASK);
        int hashCode = shortcut.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
