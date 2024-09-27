import javax.swing.JColorChooser;
import javax.swing.colorchooser.AbstractColorChooserPanel;

public class JColorChooser_4 {
    public static void main(String[] args) {
        JColorChooser colorChooser = new JColorChooser();
        AbstractColorChooserPanel[] panels = colorChooser.getChooserPanels();
        
        // Set custom color panels
        colorChooser.setChooserPanels(panels);
    }
}
