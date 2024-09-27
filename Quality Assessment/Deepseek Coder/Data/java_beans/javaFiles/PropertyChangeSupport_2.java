import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_2 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());

        // Add a PropertyChangeListener
        pcs.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println("Property changed: " + evt.getPropertyName());
            }
        });

        // Remove the PropertyChangeListener
        pcs.removePropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println("Property changed: " + evt.getPropertyName());
            }
        });
    }
}
