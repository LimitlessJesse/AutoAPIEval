import javax.swing.event.MenuDragMouseEvent;
import javax.swing.MenuElement;

public class MenuDragMouseEvent_5 {
    public static void main(String[] args) {
        MenuDragMouseEvent event = new MenuDragMouseEvent(null, 0, null, 0, 0, null, null, null);
        MenuElement[] path = event.getPath();
        for(MenuElement element : path) {
            System.out.println(element);
        }
    }
}
