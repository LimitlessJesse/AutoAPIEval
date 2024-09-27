import javax.swing.Popup;
import javax.swing.PopupFactory;
import java.awt.Component;

public class PopupFactory_1 {
    public static void main(String[] args) {
        PopupFactory factory = PopupFactory.getSharedInstance();
        Component owner = new Component() {}; // Example owner component
        Component contents = new Component() {}; // Example contents component
        int x = 100; // Example x coordinate
        int y = 100; // Example y coordinate
        
        try {
            Popup popup = factory.getPopup(owner, contents, x, y);
            // Do something with the popup
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
