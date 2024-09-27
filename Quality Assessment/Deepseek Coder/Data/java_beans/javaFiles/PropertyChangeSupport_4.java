import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_4 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());

        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println("Property " + evt.getPropertyName() + " changed from " + evt.getOldValue() + " to " + evt.getNewValue());
            }
        };

        pcs.addPropertyChangeListener("propertyName", listener);
        pcs.firePropertyChange("propertyName", "oldValue", "newValue");

        pcs.removePropertyChangeListener("propertyName", listener);
    }
}
