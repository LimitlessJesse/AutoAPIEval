import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_5 {
    public static void main(String[] args) {
        PropertyChangeSupport support = new PropertyChangeSupport(new Object());
        
        support.addPropertyChangeListener("propertyName", new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                // Add your property change logic here
            }
        });
    }
}
