import javax.swing.text.ViewFactory;
import javax.swing.text.StyledEditorKit;

public class StyledEditorKit_3 {
    public static void main(String[] args) {
        StyledEditorKit kit = new StyledEditorKit();
        ViewFactory factory = kit.getViewFactory();
        // Use the factory to create views...
    }
}
