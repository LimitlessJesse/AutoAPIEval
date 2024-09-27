import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_5 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());
        pcs.fireIndexedPropertyChange("propertyName", 0, "oldValue", "newValue");
    }
}
