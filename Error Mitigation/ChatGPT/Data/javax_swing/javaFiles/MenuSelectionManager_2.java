import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;

public class MenuSelectionManager_2 {
    public static void main(String[] args) {
        MenuSelectionManager manager = new MenuSelectionManager();
        MenuElement[] selectedPath = manager.getSelectedPath();
        for(MenuElement element : selectedPath) {
            System.out.println(element);
        }
    }
}
