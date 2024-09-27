import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTML;
import javax.swing.text.html.CSS;
import java.awt.Cursor;

public class HTMLEditorKit_5 {
    public static void main(String[] args) {
        HTMLEditorKit editorKit = new HTMLEditorKit();
        Cursor cursor = Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR);
        editorKit.setDefaultCursor(cursor);
    }
}
