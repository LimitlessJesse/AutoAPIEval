import java.beans.PropertyChangeEvent;

public class PropertyChangeEvent_1 {
    public static void main(String[] args) {
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", null, "new value");

        String propertyName = event.getPropertyName();
        System.out.println("Property Name: " + propertyName);
    }
}
