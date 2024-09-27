import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_5 {
    public static void main(String[] args) {
        VetoableChangeSupport support = new VetoableChangeSupport();
        
        // Create a PropertyChangeEvent
        PropertyChangeEvent event = new PropertyChangeEvent(this, "propertyName", oldValue, newValue);
        
        try {
            support.fireVetoableChange(event);
        } catch (PropertyVetoException e) {
            // Handle the PropertyVetoException
            e.printStackTrace();
        }
    }
}
