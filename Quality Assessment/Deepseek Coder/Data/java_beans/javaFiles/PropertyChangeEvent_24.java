import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyChangeEvent_24 {
    public static void main(String[] args) {
        PropertyChangeEvent event = new PropertyChangeEvent(new Object(), "propertyName", "oldValue", "newValue");
        System.out.println(event.getPropertyName());
    }
}
