import java.beans.PropertyChangeEvent;

public class PropertyChangeEvent_1 {
    public static void main(String[] args) {
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", oldValue, newValue);
        Object newValue = event.getNewValue();
        System.out.println("New value: " + newValue);
    }
}
