import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_1 {
    public static void main(String[] args) {
        VetoableChangeSupport support = new VetoableChangeSupport();
        VetoableChangeListener listener = new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                // Implement your logic here
            }
        };
        support.addVetoableChangeListener(listener);
    }
}
