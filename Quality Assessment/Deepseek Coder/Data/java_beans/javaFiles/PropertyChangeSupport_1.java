import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_1 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());

        PropertyChangeListener listener = new PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                System.out.println("Property changed: " + evt.getPropertyName());
            }
        };

        pcs.addPropertyChangeListener(listener);

        pcs.firePropertyChange("test", null, "test value");
    }
}
