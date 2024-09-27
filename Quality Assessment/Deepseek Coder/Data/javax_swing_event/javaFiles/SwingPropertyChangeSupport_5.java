import javax.swing.event.SwingPropertyChangeSupport;
import java.beans.PropertyChangeEvent;

public class SwingPropertyChangeSupport_5 {
    public static void main(String[] args) {
        SwingPropertyChangeSupport support = new SwingPropertyChangeSupport(SwingPropertyChangeSupport_5.class);

        support.addPropertyChangeListener(evt -> {
            System.out.println("Property changed: " + evt.getPropertyName());
        });

        support.firePropertyChange(new PropertyChangeEvent(SwingPropertyChangeSupport_5.class, "propertyName", "oldValue", "newValue"));
    }
}
