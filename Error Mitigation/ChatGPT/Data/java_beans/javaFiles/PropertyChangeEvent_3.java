import java.beans.PropertyChangeEvent;

public class PropertyChangeEvent_3 {
    public static void main(String[] args) {
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", null, "newValue");
        String propertyName = event.getPropertyName();
        System.out.println("Property Name: " + propertyName);
    }
}
