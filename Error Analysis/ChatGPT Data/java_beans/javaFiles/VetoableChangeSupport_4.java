import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_4 {
    public static void main(String[] args) {
        VetoableChangeSupport vetoSupport = new VetoableChangeSupport(this);

        try {
            vetoSupport.fireVetoableChange("propertyName", oldValue, newValue);
        } catch (PropertyVetoException e) {
            System.out.println("Property change vetoed: " + e.getMessage());
        }
    }
}
