import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_3 {
    private VetoableChangeSupport vetoableChangeSupport;

    public VetoableChangeSupport_3() {
        vetoableChangeSupport = new VetoableChangeSupport(this);
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.addVetoableChangeListener(listener);
    }

    public void removeVetoableChangeListener(VetoableChangeListener listener) {
        vetoableChangeSupport.removeVetoableChangeListener(listener);
    }

    public void setValue(Object value) throws PropertyVetoException {
        vetoableChangeSupport.fireVetoableChange(new PropertyChangeEvent(this, "value", null, value));
    }

    public static void main(String[] args) {
        VetoableChangeSupport_3 main = new VetoableChangeSupport_3();
        main.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
                if ("value".equals(evt.getPropertyName()) && "bar".equals(evt.getNewValue())) {
                    throw new PropertyVetoException("Bar is not allowed", evt);
                }
            }
        });

        try {
            main.setValue("foo");
            System.out.println("Value set to foo");
        } catch (PropertyVetoException e) {
            System.out.println("Vetoed change: " + e.getMessage());
        }

        try {
            main.setValue("bar");
            System.out.println("Value set to bar");
        } catch (PropertyVetoException e) {
            System.out.println("Vetoed change: " + e.getMessage());
        }
    }
}
