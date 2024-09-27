import javax.swing.UIManager;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UIManager_3 {
    public static void main(String[] args) {
        UIManager.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Look and feel changed: " + evt.getNewValue());
            }
        });
    }
}
