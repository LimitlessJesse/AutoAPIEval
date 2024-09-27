import javax.swing.UIDefaults;
import java.beans.PropertyChangeListener;

public class UIDefaults_3 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        defaults.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println("Default property changed: " + evt.getPropertyName());
            }
        });
        
        // Simulating a default property change
        defaults.put("background", "blue");
    }
}
