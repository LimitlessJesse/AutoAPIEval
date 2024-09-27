import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_1 {
    public static void main(String[] args) {
        // Create a VetoableChangeSupport instance
        VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport(this);

        // Adding a VetoableChangeListener
        VetoableChangeListener listener = new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                // Vetoable change logic goes here
                // For example, vetoing the change based on certain conditions
                if ("value".equals(evt.getPropertyName())) {
                    if ((int) evt.getNewValue() < 0) {
                        throw new PropertyVetoException("Value cannot be negative", evt);
                    }
                }
            }
        };

        vetoableChangeSupport.addVetoableChangeListener(listener);

        // Now the listener is added and can veto changes
    }
}
