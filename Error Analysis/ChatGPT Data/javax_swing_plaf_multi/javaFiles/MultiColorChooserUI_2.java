import javax.swing.JComponent;
import javax.swing.plaf.multi.MultiColorChooserUI;

public class MultiColorChooserUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {}; // create a JComponent object
        MultiColorChooserUI colorChooserUI = new MultiColorChooserUI(); // create a MultiColorChooserUI object
        colorChooserUI.installUI(component); // calls the installUI method from MultiColorChooserUI
    }
}
