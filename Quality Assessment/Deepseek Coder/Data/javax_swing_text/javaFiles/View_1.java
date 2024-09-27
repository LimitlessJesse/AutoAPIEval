import javax.swing.text.View;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.BadLocationException;

public class View_1 {
    public static void main(String[] args) {
        View view = new DefaultEditorKit.LeftAction();
        try {
            int startOffset = view.getStartOffset();
            System.out.println("Start Offset: " + startOffset);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
