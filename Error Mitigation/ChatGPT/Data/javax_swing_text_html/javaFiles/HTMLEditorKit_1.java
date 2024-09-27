import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTML;

public class HTMLEditorKit_1 {
    public static void main(String[] args) {
        HTMLEditorKit editorKit = new HTMLEditorKit();
        HTMLDocument doc = new HTMLDocument();
        int offset = 0;
        String html = "<html><body><h1>Hello World!</h1></body></html>";
        int popDepth = 0;
        int pushDepth = 0;
        HTML.Tag insertTag = HTML.Tag.BODY;

        try {
            editorKit.insertHTML(doc, offset, html, popDepth, pushDepth, insertTag);
            System.out.println("HTML inserted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
