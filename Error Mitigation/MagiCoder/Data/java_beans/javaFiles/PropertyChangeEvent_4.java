import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyChangeEvent_4 {
    public static void main(String[] args) {
        // Create a PropertyChangeListener
        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                // Get the name of the property that was changed
                String propertyName = evt.getPropertyName();
                System.out.println("Property changed: " + propertyName);
            }
        };

        // Create a PropertyChangeEvent
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", "oldValue", "newValue");

        // Notify the listener of the event
        listener.propertyChange(event);
    }
}
