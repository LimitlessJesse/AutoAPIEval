import javax.swing.MenuSelectionManager;
import javax.swing.event.MenuDragMouseEvent;

public class MenuDragMouseEvent_4 {
    public static void main(String[] args) {
        MenuDragMouseEvent event = new MenuDragMouseEvent(null, 0, 0, 0, 0, null, null, null, null);
        MenuSelectionManager manager = event.getMenuSelectionManager();
        System.out.println(manager);
    }
}
