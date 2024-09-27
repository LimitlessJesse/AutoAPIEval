import java.beans.PropertyChangeSupport;

public class PropertyChangeSupport_4 {
    public static void main(String[] args) {
        PropertyChangeSupport pcs = new PropertyChangeSupport(new Object());
        pcs.firePropertyChange("sampleProperty", null, "newValue");
    }
}
