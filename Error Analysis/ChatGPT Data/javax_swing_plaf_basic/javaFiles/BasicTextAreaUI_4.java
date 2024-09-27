import javax.swing.plaf.basic.BasicTextAreaUI;
import java.beans.PropertyChangeEvent;

public class BasicTextAreaUI_4 {
    public static void main(String[] args) {
        // Create an instance of BasicTextAreaUI
        BasicTextAreaUI ui = new BasicTextAreaUI();
        // Create a PropertyChangeEvent
        PropertyChangeEvent event = new PropertyChangeEvent(ui, "font", "oldValue", "newValue");
        // Call the propertyChange method
        ui.propertyChange(event);
    }
}
