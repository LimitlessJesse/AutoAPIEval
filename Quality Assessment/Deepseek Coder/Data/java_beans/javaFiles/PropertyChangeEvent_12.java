import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PropertyChangeEvent_12 {
    public static void main(String[] args) {
        PropertyChangeEvent event = new PropertyChangeEvent(new Object(), "propertyName", "oldValue", "newValue");
        System.out.println(event.getPropertyName());
    }
}
