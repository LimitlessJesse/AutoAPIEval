import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;

public class HTMLEditorKit_1 {
    public static void main(String[] args) {
        HTMLDocument doc = new HTMLDocument();
        HTMLEditorKit editorKit = new HTMLEditorKit();
        int offset = 0;
        String html = "<b>Hello World</b>";
        int popDepth = 0;
        int pushDepth = 0;
        HTML.Tag insertTag = HTML.Tag.B;

        editorKit.insertHTML(doc, offset, html, popDepth, pushDepth, insertTag);

        try {
            String text = doc.getText(0, doc.getLength());
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
