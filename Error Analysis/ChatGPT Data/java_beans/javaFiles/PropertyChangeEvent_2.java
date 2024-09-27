import java.beans.PropertyChangeEvent;

public class PropertyChangeEvent_2 {
    public static void main(String[] args) {
        // Create a PropertyChangeEvent
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", "oldValue", "newValue");
        
        // Access the old value using getOldValue()
        Object oldValue = event.getOldValue();
        
        // Print the old value
        System.out.println("Old value: " + oldValue);
    }
}
