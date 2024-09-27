import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_2 {
    public static void main(String[] args) {
        VetoableChangeSupport support = new VetoableChangeSupport(VetoableChangeSupport_2.class);

        VetoableChangeListener listener = new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                System.out.println("Vetoable change detected: " + evt);
                throw new PropertyVetoException("Vetoed by listener", evt);
            }
        };

        support.addVetoableChangeListener(listener);

        try {
            support.fireVetoableChange(null, "oldValue", "newValue");
        } catch (PropertyVetoException e) {
            System.out.println("Vetoed by exception: " + e);
        }

        support.removeVetoableChangeListener(listener);
    }
}
