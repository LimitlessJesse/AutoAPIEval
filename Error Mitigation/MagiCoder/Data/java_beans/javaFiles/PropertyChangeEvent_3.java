import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyChangeEvent_3 {
    public static void main(String[] args) {
        // Create a PropertyChangeListener
        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                // Get the old value
                Object oldValue = evt.getOldValue();
                System.out.println("Old value: " + oldValue);
            }
        };

        // Create a PropertyChangeEvent
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", "oldValue", "newValue");

        // Notify the listener
        listener.propertyChange(event);
    }
}
