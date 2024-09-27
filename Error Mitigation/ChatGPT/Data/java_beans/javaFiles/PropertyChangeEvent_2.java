import java.beans.PropertyChangeEvent;

public class PropertyChangeEvent_2 {
    public static void main(String[] args) {
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", oldValue, newValue);
        Object oldValue = event.getOldValue();
        System.out.println("Old Value: " + oldValue);
    }
}
