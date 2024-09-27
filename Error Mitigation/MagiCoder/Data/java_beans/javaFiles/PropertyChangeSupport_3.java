import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_3 {
    public static void main(String[] args) {
        // Create a PropertyChangeSupport object
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());

        // Add a PropertyChangeListener
        pcs.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println("Property changed: " + evt.getPropertyName() + " old value: " + evt.getOldValue() + " new value: " + evt.getNewValue());
            }
        });

        // Fire a property change
        pcs.firePropertyChange("myProperty", null, "newValue");
    }
}
