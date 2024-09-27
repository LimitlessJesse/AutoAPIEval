import javax.swing.JPopupMenu;
import java.awt.Component;

public class JPopupMenu_5 {
    public static void main(String[] args) {
        JPopupMenu popupMenu = new JPopupMenu();
        Component invoker = popupMenu.getInvoker();
        System.out.println("Invoker component: " + invoker);
    }
}
