import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class HTMLEditorKit_3 {
    public static void main(String[] args) {
        HTMLEditorKit editorKit = new HTMLEditorKit();
        StyleSheet styleSheet = editorKit.getStyleSheet();
        // Now you can use the styleSheet object to set or retrieve styles
    }
}
