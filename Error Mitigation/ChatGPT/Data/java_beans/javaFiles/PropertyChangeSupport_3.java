import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_3 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());
        String propertyName = "exampleProperty";
        Object oldValue = "oldValue";
        Object newValue = "newValue";
        
        pcs.firePropertyChange(propertyName, oldValue, newValue);
    }
}
