import java.beans.VetoableChangeSupport;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeListenerProxy;

public class VetoableChangeSupport_3 {
    public static void main(String[] args) {
        // Create a bean with VetoableChangeSupport
        VetoableChangeSupport bean = new VetoableChangeSupport(new Object());
        
        // Add VetoableChangeListeners to the bean
        bean.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(java.beans.PropertyChangeEvent evt) {
                // Listener logic
            }
        });
        
        // Get all VetoableChangeListeners
        VetoableChangeListener[] listeners = bean.getVetoableChangeListeners();
        
        // Iterate through the listeners and check for VetoableChangeListenerProxy
        for (int i = 0; i < listeners.length; i++) {
            if (listeners[i] instanceof VetoableChangeListenerProxy) {
                VetoableChangeListenerProxy proxy = (VetoableChangeListenerProxy) listeners[i];
                if (proxy.getPropertyName().equals("foo")) {
                    // Logic for VetoableChangeListener associated with property "foo"
                }
            }
        }
    }
}
