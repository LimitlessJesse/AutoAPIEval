import javax.swing.JFileChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicFileChooserUI;

public class BasicFileChooserUI_5 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        BasicFileChooserUI ui = new BasicFileChooserUI(fileChooser);

        PropertyChangeListener listener = ui.createPropertyChangeListener(fileChooser);
        fileChooser.addPropertyChangeListener(listener);
        
        // Perform actions that trigger property changes on JFileChooser
        
        fileChooser.removePropertyChangeListener(listener);
    }
}
