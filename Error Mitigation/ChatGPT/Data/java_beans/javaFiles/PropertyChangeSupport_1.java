import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_1 {
    public static void main(String[] args) {
        PropertyChangeSupport support = new PropertyChangeSupport(new Object());
        
        PropertyChangeListener listener = evt -> {
            System.out.println("Property changed: " + evt.getPropertyName());
            System.out.println("Old value: " + evt.getOldValue());
            System.out.println("New value: " + evt.getNewValue());
        };
        
        support.addPropertyChangeListener(listener);
        
        // Simulating property change
        support.firePropertyChange("exampleProperty", "oldValue", "newValue");
    }
}
