import javax.swing.UIDefaults;
import java.beans.PropertyChangeListener;

public class UIDefaults_4 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        PropertyChangeListener listener = evt -> {
            // do something when property changes
        };
        
        defaults.removePropertyChangeListener(listener);
    }
}
