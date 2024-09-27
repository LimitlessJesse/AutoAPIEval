import java.beans.PropertyChangeEvent;

public class PropertyChangeEvent_3 {
    public static void main(String[] args) {
        PropertyChangeEvent event = new PropertyChangeEvent(new Object(), "propertyName", "oldValue", "newValue");
        Object newValue = event.getNewValue();
        System.out.println("New Value: " + newValue);
    }
}
