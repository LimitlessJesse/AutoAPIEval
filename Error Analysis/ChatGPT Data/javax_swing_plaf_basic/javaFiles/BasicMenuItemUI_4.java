import javax.swing.plaf.basic.BasicMenuItemUI;
import javax.swing.MenuElement;

public class BasicMenuItemUI_4 {
    public static void main(String[] args) {
        BasicMenuItemUI basicMenuItemUI = new BasicMenuItemUI();
        MenuElement[] path = basicMenuItemUI.getPath();
        System.out.println("Menu path:");
        for (MenuElement element : path) {
            System.out.println(element);
        }
    }
}
