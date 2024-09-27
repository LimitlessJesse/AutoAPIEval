import java.beans.VetoableChangeSupport;

public class VetoableChangeSupport_5 {
    public static void main(String[] args) {
        VetoableChangeSupport vetoableChangeSupport = new VetoableChangeSupport();
        boolean hasListeners = vetoableChangeSupport.hasListeners("propertyName");
        System.out.println("Has listeners for propertyName: " + hasListeners);
    }
}
