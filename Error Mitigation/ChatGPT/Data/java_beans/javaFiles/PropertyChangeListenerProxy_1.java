import java.beans.PropertyChangeListenerProxy;

public class PropertyChangeListenerProxy_1 {
    public static void main(String[] args) {
        PropertyChangeListenerProxy proxy = new PropertyChangeListenerProxy("propertyName", null);
        System.out.println(proxy.getPropertyName());
    }
}
