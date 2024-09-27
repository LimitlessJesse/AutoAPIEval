import javax.swing.colorchooser.AbstractColorChooserPanel;

public class AbstractColorChooserPanel_4 {
    public static void main(String[] args) {
        AbstractColorChooserPanel panel = new AbstractColorChooserPanel() {
            @Override
            public String getDisplayName() {
                return "Color Chooser Panel";
            }
        };
        
        System.out.println(panel.getDisplayName());
    }
}
