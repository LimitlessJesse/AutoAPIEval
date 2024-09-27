import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_3 {
    public static void main(String[] args) {
        PropertyChangeSupport support = new PropertyChangeSupport(new Object());
        
        PropertyChangeListener[] listeners = support.getPropertyChangeListeners();
        
        for(PropertyChangeListener listener : listeners) {
            System.out.println(listener.toString());
        }
    }
}
