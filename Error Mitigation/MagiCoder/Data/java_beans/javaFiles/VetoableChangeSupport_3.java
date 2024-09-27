import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_3 {
    public static void main(String[] args) {
        VetoableChangeSupport vcs = new VetoableChangeSupport(new Object());
        vcs.addVetoableChangeListener(new VetoableChangeListener() {
            @Override
            public void vetoableChange(java.beans.PropertyChangeEvent evt) throws PropertyVetoException {
                if (evt.getNewValue().equals("Hello")) {
                    throw new PropertyVetoException("Value cannot be 'Hello'", evt);
                }
            }
        });

        try {
            vcs.fireVetoableChange("propertyName", null, "Hello");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }
}
