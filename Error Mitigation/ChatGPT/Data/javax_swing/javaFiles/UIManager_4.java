import javax.swing.UIManager;
import java.beans.PropertyChangeListener;

public class UIManager_4 {
    public static void main(String[] args) {
        PropertyChangeListener listener = evt -> {
            // Handle property change event
            System.out.println("Property changed: " + evt.getPropertyName());
        };
        
        UIManager.addPropertyChangeListener(listener);
    }
}
