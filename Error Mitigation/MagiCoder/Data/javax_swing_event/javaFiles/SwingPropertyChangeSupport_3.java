import javax.swing.event.SwingPropertyChangeSupport;
import java.beans.PropertyChangeEvent;

public class SwingPropertyChangeSupport_3 {
    public static void main(String[] args) {
        SwingPropertyChangeSupport support = new SwingPropertyChangeSupport(new Object());
        support.addPropertyChangeListener(evt -> {
            System.out.println("Property changed: " + evt.getPropertyName() + " - " + evt.getNewValue());
        });

        support.firePropertyChange(new PropertyChangeEvent(this, "propertyName", "oldValue", "newValue"));
    }
}
