import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_4 {
    public static void main(String[] args) {
        // Create a bean with PropertyChangeSupport
        MyBean bean = new MyBean();
        
        // Add PropertyChangeListeners
        bean.addPropertyChangeListener(new MyPropertyChangeListener("foo"));
        bean.addPropertyChangeListener(new MyPropertyChangeListener("bar"));
        
        // Get all PropertyChangeListeners
        PropertyChangeListener[] listeners = bean.getPropertyChangeListeners();
        
        // Iterate through the listeners and check for PropertyChangeListenerProxy
        for (int i = 0; i < listeners.length; i++) {
            if (listeners[i] instanceof PropertyChangeListenerProxy) {
                PropertyChangeListenerProxy proxy = (PropertyChangeListenerProxy) listeners[i];
                if (proxy.getPropertyName().equals("foo")) {
                    System.out.println("Listener associated with property 'foo' found");
                }
            }
        }
    }
}

class MyBean {
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }
    
    public PropertyChangeListener[] getPropertyChangeListeners() {
        return pcs.getPropertyChangeListeners();
    }
}

class MyPropertyChangeListener implements PropertyChangeListener {
    private String propertyName;
    
    public MyPropertyChangeListener(String propertyName) {
        this.propertyName = propertyName;
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        // Handle property change event
    }
}
