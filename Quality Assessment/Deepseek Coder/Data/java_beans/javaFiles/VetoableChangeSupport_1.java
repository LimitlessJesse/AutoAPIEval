import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_1 {
    public static void main(String[] args) {
        VetoableChangeSupport support = new VetoableChangeSupport(VetoableChangeSupport_1.class);

        support.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                System.out.println("Vetoable change detected: " + evt.getPropertyName());
                throw new PropertyVetoException("Vetoed by listener", evt);
            }
        });

        try {
            support.fireVetoableChange("test", "oldValue", "newValue");
        } catch (PropertyVetoException e) {
            System.out.println("Vetoed by listener: " + e.getMessage());
        }
    }
}
