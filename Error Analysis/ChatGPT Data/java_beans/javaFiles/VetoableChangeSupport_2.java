import java.beans.VetoableChangeSupport;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;

public class VetoableChangeSupport_2 {
    public static void main(String[] args) {
        // Create a VetoableChangeSupport instance
        VetoableChangeSupport vcs = new VetoableChangeSupport();

        // Create a VetoableChangeListener
        VetoableChangeListener listener = new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                // Perform some validation on the property change
                if (evt.getNewValue() instanceof String) {
                    // Veto the change if the new value is a string
                    throw new PropertyVetoException("Cannot set property to a String value", evt);
                }
            }
        };

        // Add the listener to the VetoableChangeSupport
        vcs.addVetoableChangeListener(listener);

        // Remove the listener from the VetoableChangeSupport
        vcs.removeVetoableChangeListener(listener);
    }
}
