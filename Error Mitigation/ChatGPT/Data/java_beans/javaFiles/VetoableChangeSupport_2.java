import java.beans.VetoableChangeSupport;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;

public class VetoableChangeSupport_2 {
    public static void main(String[] args) {
        VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);
        
        // Create a VetoableChangeListener
        VetoableChangeListener listener = new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                // Handle property change event
            }
        };
        
        // Add the VetoableChangeListener
        vetoableChangeSupport.addVetoableChangeListener(listener);
        
        // Remove the VetoableChangeListener
        vetoableChangeSupport.removeVetoableChangeListener(listener);
    }
}
