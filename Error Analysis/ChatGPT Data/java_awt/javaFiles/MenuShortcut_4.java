import java.awt.MenuShortcut;

public class MenuShortcut_4 {
    public static void main(String[] args) {
        MenuShortcut menuShortcut = new MenuShortcut(65, true);
        boolean usesShiftModifier = menuShortcut.usesShiftModifier();
        System.out.println("Uses Shift Modifier: " + usesShiftModifier);
    }
}
