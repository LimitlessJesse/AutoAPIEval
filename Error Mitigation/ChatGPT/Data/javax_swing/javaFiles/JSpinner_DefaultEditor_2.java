import javax.swing.JSpinner.DefaultEditor;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class JSpinner_DefaultEditor_2 {
    public static void main(String[] args) {
        DefaultEditor defaultEditor = new DefaultEditor(null);
        PropertyChangeEvent propertyChangeEvent = new PropertyChangeEvent(defaultEditor, "value", null, 10);
        defaultEditor.propertyChange(propertyChangeEvent);
    }
    
    public void propertyChange(PropertyChangeEvent e) {
        DefaultEditor defaultEditor = (DefaultEditor) e.getSource();
        if (defaultEditor != null && defaultEditor.getTextField() != null) {
            // Perform actions based on the property change event
            System.out.println("Property change event received: " + e);
        }
    }
}
