import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_5 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());

        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Property " + evt.getPropertyName() + " changed from " + evt.getOldValue() + " to " + evt.getNewValue());
            }
        };

        pcs.addPropertyChangeListener(listener);

        pcs.firePropertyChange("name", "John", "Mike");
    }
}
