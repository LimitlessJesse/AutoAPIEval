import javax.swing.event.SwingPropertyChangeSupport;
import java.beans.PropertyChangeEvent;

public class SwingPropertyChangeSupport_3 {
    public static void main(String[] args) {
        SwingPropertyChangeSupport support = new SwingPropertyChangeSupport(new Object());
        PropertyChangeEvent evt = new PropertyChangeEvent(new Object(), "propertyName", "oldValue", "newValue");
        support.firePropertyChange(evt);
    }
}
