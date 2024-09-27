import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_3 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());

        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println("Property " + evt.getPropertyName() + " changed from " + evt.getOldValue() + " to " + evt.getNewValue());
            }
        };

        pcs.addPropertyChangeListener("name", listener);
        pcs.firePropertyChange("name", "oldValue", "newValue");
    }
}
