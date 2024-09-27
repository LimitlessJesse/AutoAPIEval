import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyChangeEvent_2 {
    public static void main(String[] args) {
        // Create a PropertyChangeListener
        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                // Get the new value
                Object newValue = evt.getNewValue();
                System.out.println("New value: " + newValue);
            }
        };

        // Create a PropertyChangeEvent
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", "oldValue", "newValue");

        // Notify the listener
        listener.propertyChange(event);
    }
}
