import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_4 {
    public static void main(String[] args) {
        VetoableChangeSupport support = new VetoableChangeSupport();
        
        try {
            support.fireVetoableChange("propertyName", "oldValue", "newValue");
        } catch (PropertyVetoException e) {
            System.out.println("Property update vetoed: " + e.getMessage());
        }
    }
}
