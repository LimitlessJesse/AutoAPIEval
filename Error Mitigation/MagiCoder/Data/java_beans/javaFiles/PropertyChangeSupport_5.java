import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_5 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());
        PropertyChangeListener listener = evt -> {
            System.out.println("Property changed: " + evt.getPropertyName() + ", old value: " + evt.getOldValue() + ", new value: " + evt.getNewValue());
        };
        pcs.addPropertyChangeListener(listener);

        boolean oldValue = true;
        boolean newValue = false;
        String propertyName = "myProperty";

        pcs.firePropertyChange(propertyName, oldValue, newValue);
    }
}
