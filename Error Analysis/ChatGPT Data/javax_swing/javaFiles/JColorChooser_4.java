import javax.swing.JColorChooser;
import javax.swing.colorchooser.AbstractColorChooserPanel;

public class JColorChooser_4 {
    public static void main(String[] args) {
        JColorChooser colorChooser = new JColorChooser();
        
        // Create an array of AbstractColorChooserPanel
        AbstractColorChooserPanel[] panels = new AbstractColorChooserPanel[1];
        
        // Set the array of panels to the color chooser
        colorChooser.setChooserPanels(panels);
    }
}
